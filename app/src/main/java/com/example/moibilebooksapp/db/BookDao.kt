//package com.example.moibilebooksapp.db
//
//import androidx.lifecycle.LiveData
//import androidx.room.*
//import com.example.moibilebooksapp.db.relations.ItemAndVolumeInfo
//import com.example.moibilebooksapp.models.ImageLinks
//import com.example.moibilebooksapp.models.Item
//import com.example.moibilebooksapp.models.VolumeInfo
//
//@Dao
//interface BookDao {
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertItem(item: Item): Long
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertVolumeInfo(info: VolumeInfo): Long
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertImageLinks(url: ImageLinks): Long
//
//    @Query("SELECT * FROM items")
//    fun getAllItems(): LiveData<List<Item>>
//
//    @Query("SELECT * FROM volumeInfo")
//    fun getAllVolumeInfo(): LiveData<List<Item>>
//
//    @Query("SELECT * FROM imageLinks")
//    fun getAllImageLinks(): LiveData<List<Item>>
//
//    @Transaction
//    @Query("SELECT * FROM items WHERE id = :id")
//    suspend fun getItemAndVolumeInfo(id: String): List<ItemAndVolumeInfo>
//
//    @Transaction
//    @Query("SELECT * FROM volumeInfo WHERE title = :title")
//    suspend fun getVolumeInfoAndImageLinks(title: String): List<ItemAndVolumeInfo>
//
//    @Delete
//    suspend fun deleteItem(item: Item)
//
//}