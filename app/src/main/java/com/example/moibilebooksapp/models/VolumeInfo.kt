package com.example.moibilebooksapp.models

data class VolumeInfo(
    val allowAnonLogging: Boolean,
    val authors: List<String>,
    val canonicalVolumeLink: String,
    val categories: List<String>,
    val contentVersion: String,
    val description: String,
    val imageLinks: ImageLinks,
    val infoLink: String,
    val language: String,
    val maturityRating: String,
    val pageCount: Int,
    val previewLink: String,
    val printType: String,
    val publishedDate: String,
    val publisher: String,
    val subtitle: String,
    val title: String
)