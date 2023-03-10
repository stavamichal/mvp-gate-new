package cz.tyckouni.mvpgate.party.grpc.converter.idp

import cz.tyckouni.mvpgate.party.grpc.IdpGrpc
import cz.tyckouni.mvpgate.party.persistence.idp.Idp
import org.springframework.stereotype.Component

/**
 * Basic implementation of the [IdpGrpcConverter].
 */
@Component
class IdpGrpcConverterImpl : IdpGrpcConverter {
    override fun toGrpc(dbEntity: Idp): IdpGrpc {
        return IdpGrpc.newBuilder()
            .setGuid(dbEntity.guid.toString())
            .setName(dbEntity.name)
            .build()
    }
}
