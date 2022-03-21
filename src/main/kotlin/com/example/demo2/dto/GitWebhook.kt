package com.example.demo2.dto

data class GitWebhook(val sender: Sender)

data class Sender(val login: String, val id:Long)