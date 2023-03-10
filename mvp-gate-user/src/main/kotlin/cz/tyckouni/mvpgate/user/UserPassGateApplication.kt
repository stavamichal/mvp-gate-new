package cz.tyckouni.mvpgate.party

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * User application runner class.
 */
@SpringBootApplication
class StorePassGateApplication

fun main(args: Array<String>) {
    runApplication<StorePassGateApplication>(*args)
}
