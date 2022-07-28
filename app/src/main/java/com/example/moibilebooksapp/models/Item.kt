package com.example.moibilebooksapp.models


data class Item(
    val etag: String,
    val id: String,
    val kind: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo
)