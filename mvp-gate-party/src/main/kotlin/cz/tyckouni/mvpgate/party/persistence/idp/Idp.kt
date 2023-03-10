package cz.tyckouni.mvpgate.party.persistence.idp

import cz.tyckouni.mvpgate.party.persistence.PartyEntity
import jakarta.persistence.Entity

/**
 * Idp DB entity.
 */
@Entity
class Idp(
    var name: String,
) : PartyEntity()
