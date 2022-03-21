package com.example.demo2.controller

import com.example.demo2.dto.GitWebhook
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import java.net.http.HttpClient

@RestController
class PingController {

    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }

    @PostMapping("/webhook")
    fun webhook(@RequestBody gitWebhook: GitWebhook){
        println(gitWebhook.sender.login)
        println(gitWebhook.sender.id)
    }

}