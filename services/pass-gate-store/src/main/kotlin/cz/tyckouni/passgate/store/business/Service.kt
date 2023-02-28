package cz.tyckouni.passgate.store.business

import cz.tyckouni.passgate.store.persistence.StoreEntity
import java.util.Optional
import java.util.UUID

interface Service<T : StoreEntity> {

    fun findByGuid(guid: UUID): Optional<T>
}
