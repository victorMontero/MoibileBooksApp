package com.example.moibilebooksapp.models

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

//
//@Entity(
//    tableName = "items"
//)
data class Item(
   // @PrimaryKey(autoGenerate = true)
    val internalId: Int,
    val id: String,
//    @Ignore
    val volumeInfo: VolumeInfo
)