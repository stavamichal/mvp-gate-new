package cz.tyckouni.mvpgate.party.persistence.sp

import cz.tyckouni.mvpgate.party.persistence.PartyEntity
import jakarta.persistence.Entity

/**
 * Sp DB entity.
 */
@Entity
class Sp(
    var name: String,
) : PartyEntity()
