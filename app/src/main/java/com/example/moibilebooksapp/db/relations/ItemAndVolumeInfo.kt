//package com.example.moibilebooksapp.db.relations
//
//import androidx.room.Embedded
//import androidx.room.Relation
//import com.example.moibilebooksapp.models.Item
//import com.example.moibilebooksapp.models.VolumeInfo
//
//data class ItemAndVolumeInfo(
//    @Embedded val item: Item,
//    @Relation(
//        parentColumn = "id",
//        entityColumn = "id"
//    )
//    val volumeInfo: VolumeInfo
//)