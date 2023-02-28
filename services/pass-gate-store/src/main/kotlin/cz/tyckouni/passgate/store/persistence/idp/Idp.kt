package cz.tyckouni.passgate.store.persistence.idp

import cz.tyckouni.passgate.store.persistence.StoreEntity
import jakarta.persistence.Entity

/**
 * Idp DB entity.
 */
@Entity
class Idp(
    var name: String,
) : StoreEntity()
