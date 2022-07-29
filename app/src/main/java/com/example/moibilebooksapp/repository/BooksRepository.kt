package com.example.moibilebooksapp.repository

import com.example.moibilebooksapp.api.RetrofitInstance

class BooksRepository(
    //val db: BookDatabase
) {

    suspend fun getBooks() = RetrofitInstance.api.getBooks()
}