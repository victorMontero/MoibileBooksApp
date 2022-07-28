//package com.example.moibilebooksapp.db.relations
//
//import androidx.room.Embedded
//import androidx.room.Relation
//import com.example.moibilebooksapp.models.ImageLinks
//import com.example.moibilebooksapp.models.VolumeInfo
//
//data class VolumeInfoAndImageLinks(
//    @Embedded val volumeInfo: VolumeInfo,
//    @Relation(
//        parentColumn = "title",
//        entityColumn = "title",
//    )
//    val image: ImageLinks
//)