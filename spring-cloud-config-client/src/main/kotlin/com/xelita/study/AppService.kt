package com.xelita.study

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class AppService(@Value("\${welcome.message}") val message: String) {

    val log: Logger = LoggerFactory.getLogger(AppService::class.java)

    fun test(): Mono<String> {
        log.info("in AppService > test()")
        return Mono.just(message)
    }
}