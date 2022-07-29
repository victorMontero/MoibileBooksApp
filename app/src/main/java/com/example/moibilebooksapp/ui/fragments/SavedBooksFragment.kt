package com.example.moibilebooksapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.moibilebooksapp.R
import com.example.moibilebooksapp.ui.BooksViewModel
import com.example.moibilebooksapp.ui.MainActivity

class SavedBooksFragment : Fragment(R.layout.fragment_saved_books) {

    lateinit var viewModel: BooksViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}