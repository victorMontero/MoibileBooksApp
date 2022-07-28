//package com.example.moibilebooksapp.db
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.example.moibilebooksapp.models.ImageLinks
//import com.example.moibilebooksapp.models.Item
//import com.example.moibilebooksapp.models.VolumeInfo
//
//
//@Database(
//    entities = [Item::class, VolumeInfo::class, ImageLinks::class],
//    version = 1
//)
//abstract class BookDatabase : RoomDatabase() {
//
//    abstract fun getBookDao(): BookDao
//
//    companion object {
//        @Volatile
//        private var instance: BookDatabase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
//            instance ?: creaetDatabase(context).also { instance = it }
//        }
//
//        private fun creaetDatabase(context: Context) = Room.databaseBuilder(
//            context.applicationContext,
//            BookDatabase::class.java,
//            "books_db.db"
//        ).build()
//
//    }
//}