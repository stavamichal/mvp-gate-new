package cz.tyckouni.passgate.store

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Store application runner class.
 */
@SpringBootApplication
class StorePassGateApplication

fun main(args: Array<String>) {
    runApplication<StorePassGateApplication>(*args)
}
