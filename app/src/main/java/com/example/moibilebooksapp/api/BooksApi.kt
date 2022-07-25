package com.example.moibilebooksapp.api

import com.example.moibilebooksapp.models.BookList
import com.example.moibilebooksapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApi {


    @GET(" ")
    suspend fun getBooks(
        @Query("q") inTitle: String = "mobile",
        @Query("key") apiKey: String = API_KEY
    ): Response<BookList>
}