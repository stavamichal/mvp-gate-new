package cz.tyckouni.passgate.store.persistence.idp

import cz.tyckouni.passgate.store.persistence.StoreEntity
import jakarta.persistence.Entity

@Entity
class Idp(
    var name: String
) : StoreEntity()