package cz.tyckouni.passgate.store.business

import cz.tyckouni.passgate.store.persistence.StoreEntity
import cz.tyckouni.passgate.store.persistence.StoreRepository
import java.util.Objects
import java.util.Optional
import java.util.UUID

open class ServiceBase<T : StoreEntity>(
    private val repository: StoreRepository<T>,
) : Service<T> {
    override fun findByGuid(guid: UUID): Optional<T> {
        return repository.findByGuid(Objects.requireNonNull(guid, "guid cannot be null"))
    }
}
