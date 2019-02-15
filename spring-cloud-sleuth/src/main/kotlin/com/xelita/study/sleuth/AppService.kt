package com.xelita.study.sleuth

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class AppService {

    val log: Logger = LoggerFactory.getLogger(AppService::class.java)

    fun test(): Mono<String> {
        log.info("in AppService > test()")
        return Mono.just("Hello World!")
    }
}