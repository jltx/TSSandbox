package com.example.myapplication.models

import kotlinx.serialization.Required
import kotlinx.serialization.Serializable
import java.time.Duration

@Serializable
data class MediaAttachment(
    val blurhash: String? = null,
    val description: String? = null,
    val external_video_id: String?,
    val id: String,
    val meta: Meta,
    val preview_remote_url: String? = null,
    val preview_url: String?,
    val remote_url: String?,
    val text_url: String,
    val type: String,
    val url: String
)

@Serializable
data class Meta(
    val original: VideoSize? = null,
    val small: VideoSize? = null
)

@Serializable
data class VideoSize(

    val aspect: Double? = null,
    val height: Int,
    val size: String? = null,
    val width: Int,
    val duration: Float? = null,
    val bitrate: Int? = null,
    val frame_rate: String? = null
)
