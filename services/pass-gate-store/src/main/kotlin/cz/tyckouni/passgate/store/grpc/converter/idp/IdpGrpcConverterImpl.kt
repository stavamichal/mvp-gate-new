package cz.tyckouni.passgate.store.grpc.converter.idp

import cz.tyckouni.passgate.store.grpc.Idp
import org.springframework.stereotype.Component

/**
 * Basic implementation of the [IdpGrpcConverter].
 */
@Component
class IdpGrpcConverterImpl : IdpGrpcConverter {
    override fun toGrpc(dbEntity: cz.tyckouni.passgate.store.persistence.idp.Idp): Idp {
        return Idp.newBuilder()
            .setGuid(dbEntity.guid.toString())
            .setName(dbEntity.name)
            .build()
    }
}
