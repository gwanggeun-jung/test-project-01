package com.example.demo2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import java.net.http.HttpClient

@RestController
class PingController {

    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }

}