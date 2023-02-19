package cz.tyckouni.passgate.store.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface StoreRepository<T> : JpaRepository<T, Long> {
}