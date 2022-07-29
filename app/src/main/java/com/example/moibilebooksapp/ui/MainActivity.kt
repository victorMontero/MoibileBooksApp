package com.example.moibilebooksapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.moibilebooksapp.R
import com.example.moibilebooksapp.repository.BooksRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: BooksViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = BooksRepository()
        val viewModelProviderFactory = BooksViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(BooksViewModel::class.java)

        setContentView(R.layout.activity_main)


        bottom_navigation_view.setupWithNavController(books_nav_host_fragment.findNavController())
    }
}