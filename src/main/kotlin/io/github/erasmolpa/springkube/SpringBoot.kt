package io.github.erasmolpa.springkube

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBoot

fun main(args: Array<String>) {
	runApplication<SpringBoot>(*args)
}
