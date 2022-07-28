package com.example.moibilebooksapp.models

data class VolumeInfo(
    val authors: List<String>,
    val contentVersion: String,
    val description: String,
    val imageLinks: ImageLinks,
    val title: String
)