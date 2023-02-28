package cz.tyckouni.passgate.store.grpc

import cz.tyckouni.passgate.store.business.idp.IdpService
import cz.tyckouni.passgate.store.grpc.converter.idp.IdpGrpcConverter
import io.grpc.stub.StreamObserver
import io.micrometer.tracing.Tracer
import net.devh.boot.grpc.server.service.GrpcService
import org.slf4j.LoggerFactory
import java.util.UUID

/**
 * Implementation of the [IdpServiceGrpc] gRPC service
 */
@GrpcService
class IdpServiceGrpcImpl(
    private val idpService: IdpService,
    private val converter: IdpGrpcConverter,
    private val tracer: Tracer,
) : IdpServiceGrpc.IdpServiceImplBase() {
    override fun findByGuid(request: FindByGuidRequest?, responseObserver: StreamObserver<Idp>?) {
        requireNotNull(request) { "request cannot be null" }
        requireNotNull(responseObserver) { "responseObserver cannot be null" }

        tracer.currentTraceContext().wrap(
            Runnable {
                LOGGER.info("Find by guid called.")

                val responseIdp = idpService.findByGuid(UUID.fromString(request.guid))
                    .map(converter::toGrpc)
                    .orElse(Idp.getDefaultInstance())

                responseObserver.onNext(responseIdp)
            },
        )
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(IdpServiceGrpcImpl::class.java)
    }
}
