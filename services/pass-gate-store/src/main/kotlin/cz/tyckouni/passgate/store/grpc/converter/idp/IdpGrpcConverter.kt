package cz.tyckouni.passgate.store.grpc.converter.idp

import cz.tyckouni.passgate.store.grpc.converter.GrpcConverter
import cz.tyckouni.passgate.store.persistence.idp.Idp

/**
 * [GrpcConverter] for the Idp entities.
 */
interface IdpGrpcConverter : GrpcConverter<Idp, cz.tyckouni.passgate.store.grpc.Idp>
