package com.example.myapplication.models

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val account: Account,
    val bookmarked: Boolean,
    val card: Card?,
    val content: String,
    val created_at: String,
    val emojis: List<String?>,
    val favourited: Boolean,
    val favourites_count: Int,
    val id: String,
    val in_reply_to_account_id: String?,
    val in_reply_to_id: String?,
    val language: String?,
    val media_attachments: List<MediaAttachment>,
    val mentions: List<Mention>,
    val muted: Boolean,
    val poll: String?,
    val reblog: Message?,
    val reblogged: Boolean,
    val reblogs_count: Int,
    val replies_count: Int,
    val sensitive: Boolean,
    val spoiler_text: String?,
    val tags: List<Tag>,
    val uri: String,
    val url: String,
    val visibility: String
)


