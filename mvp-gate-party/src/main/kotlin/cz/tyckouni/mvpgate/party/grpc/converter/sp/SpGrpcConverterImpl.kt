package cz.tyckouni.mvpgate.party.grpc.converter.sp

import cz.tyckouni.mvpgate.party.grpc.SpGrpc
import cz.tyckouni.mvpgate.party.persistence.sp.Sp
import org.springframework.stereotype.Component

/**
 * Basic implementation of the [SpGrpcConverter].
 */
@Component
class SpGrpcConverterImpl : SpGrpcConverter {
    override fun toGrpc(dbEntity: Sp): SpGrpc {
        return SpGrpc.newBuilder()
            .setGuid(dbEntity.guid.toString())
            .setName(dbEntity.name)
            .build()
    }
}
