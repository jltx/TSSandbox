package com.example.myapplication.models

import kotlinx.serialization.Serializable

@Serializable
data class Mention(
    val acct: String,
    val id: String,
    val url: String,
    val username: String
)
