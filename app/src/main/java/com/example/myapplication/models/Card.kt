package com.example.myapplication.models

import kotlinx.serialization.Serializable

@Serializable
data class Card(
    val author_name: String,
    val author_url: String,
    val blurhash: String? = null,
    val description: String,
    val embed_url: String,
    val height: Int,
    val html: String,
    val image: String? = null,
    val provider_name: String,
    val provider_url: String,
    val title: String,
    val type: String,
    val url: String,
    val width: Int
)
