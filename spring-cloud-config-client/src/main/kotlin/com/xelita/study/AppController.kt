package com.xelita.study

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RequestMapping("/api")
@RestController
class AppController(@Autowired val service: AppService) {

    val log: Logger = LoggerFactory.getLogger(AppController::class.java)

    @GetMapping("/test")
    fun test(): Mono<String> {
        log.info("in AppController > test()")
        return this.service.test()
    }
}