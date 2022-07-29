package com.example.moibilebooksapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moibilebooksapp.models.BookList
import com.example.moibilebooksapp.repository.BooksRepository
import com.example.moibilebooksapp.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class BooksViewModel(val repository: BooksRepository) : ViewModel() {

    val books: MutableLiveData<Resource<BookList>> = MutableLiveData()

    init {
        getBooks()
    }

    fun getBooks() = viewModelScope.launch {
        books.postValue(Resource.Loading())
        val response = repository.getBooks()
        books.postValue(handleBooksResponse(response))
    }

    private fun handleBooksResponse(response: Response<BookList>): Resource<BookList> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }
}