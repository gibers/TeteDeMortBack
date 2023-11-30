package com.example.demo.controllers

import mu.KotlinLogging
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

//@CrossOrigin
@RestController
class ConnectionController {

    private val logger = KotlinLogging.logger {}

    @PostMapping
    fun doConnection(@RequestParam(name = "user") user: String, @RequestParam(name = "pass") pass: String): String {
        logger.info { " user -> $user; pass -> $pass" }
        return user;
    }

    @GetMapping(produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun doGet(): String {
        return "it is OK";
    }

}
