package cz.tyckouni.passgate.store.grpc.converter

/**
 * Converter between DB and gRPC entities.
 */
interface GrpcConverter<D, G> {

    /**
     * Converts the given [dbEntity] into a gRPC entity.
     *
     * @return converted gRPC entity
     * @property D DB entity type
     * @property G gRPC type
     */
    fun toGrpc(dbEntity: D): G
}
