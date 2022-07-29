package com.example.moibilebooksapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moibilebooksapp.R
import com.example.moibilebooksapp.adapter.BooksAdapter
import com.example.moibilebooksapp.ui.BooksViewModel
import com.example.moibilebooksapp.ui.MainActivity
import com.example.moibilebooksapp.util.Resource
import kotlinx.android.synthetic.main.fragment_books.*

class BooksFragment : Fragment(R.layout.fragment_books) {

    lateinit var viewModel: BooksViewModel
    lateinit var bookAdapter: BooksAdapter

    val TAG = "booksFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        setupRecyclerView()

        viewModel.books.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { booksResponse ->
                        bookAdapter.differ.submitList(booksResponse.items)
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let { message ->
                        Log.e(TAG, "erro: $message")
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })
    }

    private fun hideProgressBar() {
        progress_bar_fragment_books.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        progress_bar_fragment_books.visibility = View.VISIBLE
    }

    private fun setupRecyclerView() {
        bookAdapter = BooksAdapter()
        recycler_view_books_fragment.apply {
            adapter = bookAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}