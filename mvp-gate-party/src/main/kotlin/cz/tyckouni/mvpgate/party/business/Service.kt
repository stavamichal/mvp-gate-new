package cz.tyckouni.mvpgate.party.business

import cz.tyckouni.mvpgate.party.persistence.PartyEntity
import java.util.Optional
import java.util.UUID

interface Service<T : PartyEntity> {

    fun findByGuid(guid: UUID): Optional<T>
}
