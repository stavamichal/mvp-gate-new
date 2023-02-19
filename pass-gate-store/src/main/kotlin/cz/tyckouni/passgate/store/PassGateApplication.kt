package cz.tyckouni.passgate.store

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PassGateApplication

fun main(args: Array<String>) {
	runApplication<PassGateApplication>(*args)
}
