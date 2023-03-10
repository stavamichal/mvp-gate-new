package cz.tyckouni.mvpgate.party.grpc

import cz.tyckouni.mvpgate.grpc.ByGuidRequest
import io.micrometer.tracing.Tracer
import org.lognet.springboot.grpc.GRpcService
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@GRpcService
class RelayingPartyServiceGrpcImpl(
    private val tracer: Tracer,
) : RelayingPartyServiceGrpcKt.RelayingPartyServiceCoroutineImplBase() {
    override suspend fun findByGuid(request: ByGuidRequest): RelayingParty {
        LOGGER.debug("Call to RelayingPartyService.findByGuid: {}", request)
        // TODO

        val span = tracer.startScopedSpan("TODO")

        span.end()

        return RelayingParty.getDefaultInstance()
    }

    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(RelayingPartyServiceGrpcImpl::class.java)
    }
}
