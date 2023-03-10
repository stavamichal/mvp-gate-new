package cz.tyckouni.mvpgate.party.business

import cz.tyckouni.mvpgate.party.persistence.PartyEntity
import cz.tyckouni.mvpgate.party.persistence.PartyRepository
import java.util.Objects
import java.util.Optional
import java.util.UUID

open class ServiceBase<T : PartyEntity>(
    private val repository: PartyRepository<T>,
) : Service<T> {
    override fun findByGuid(guid: UUID): Optional<T> {
        return repository.findByGuid(Objects.requireNonNull(guid, "guid cannot be null"))
    }
}
