package cz.tyckouni.mvpgate.party.grpc

import cz.tyckouni.mvpgate.grpc.ByGuidRequest
import cz.tyckouni.mvpgate.party.business.sp.SpService
import cz.tyckouni.mvpgate.party.grpc.converter.sp.SpGrpcConverter
import io.micrometer.tracing.Tracer
import org.lognet.springboot.grpc.GRpcService
import org.slf4j.LoggerFactory
import java.util.UUID

/**
 * Implementation of the [SpServiceGrpc] gRPC service
 */
@GRpcService
class SpServiceGrpcImpl(
    private val spService: SpService,
    private val converter: SpGrpcConverter,
    private val tracer: Tracer,
) : SpServiceGrpcKt.SpServiceCoroutineImplBase() {

    override suspend fun findByGuid(request: ByGuidRequest): SpGrpc {
        val span = tracer.startScopedSpan("SP.FIND_BY_GUID")

        LOGGER.debug("Call to SpService.findByGuid: {}", request)

        val sp = spService.findByGuid(UUID.fromString(request.guid))
            .map(converter::toGrpc)
            .orElse(SpGrpc.getDefaultInstance())

        span.end()

        return sp
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(SpServiceGrpcImpl::class.java)
    }
}
