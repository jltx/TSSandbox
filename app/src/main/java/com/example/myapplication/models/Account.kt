package com.example.myapplication.models

import kotlinx.serialization.Serializable

@Serializable
data class Account(
    val acct: String,
    val avatar: String,
    val avatar_static: String,
    val bot: Boolean,
    val created_at: String,
    val discoverable: Boolean? = null,
    val display_name: String,
    val emojis: List<String>,
    val fields: List<String>,
    val followers_count: Int,
    val following_count: Int,
    val group: Boolean,
    val header: String,
    val header_static: String,
    val id: String,
    val last_status_at: String,
    val location: String,
    val locked: Boolean,
    val note: String,
    val statuses_count: Int,
    val url: String,
    val username: String,
    val verified: Boolean,
    val website: String
)
