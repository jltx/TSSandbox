package com.example.myapplication.models

import kotlinx.serialization.Serializable

@Serializable
data class Tag(
    val name: String,
    val url: String
)
