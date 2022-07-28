package com.example.moibilebooksapp.models

//
//@Entity(
//    tableName = "volumeInfo"
//)
data class VolumeInfo(
    val authors: List<String>,
    val description: String,
    val imageLinks: ImageLinks,
     val title: String,
    val id: String,
//    @PrimaryKey(autoGenerate = true)
//    val internalId: Int,
)