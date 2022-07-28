package com.example.moibilebooksapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moibilebooksapp.R
import com.example.moibilebooksapp.models.Item
import kotlinx.android.synthetic.main.item_book_preview.view.*

class BooksAdapter : RecyclerView.Adapter<BooksAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differCallback = object  : DiffUtil.ItemCallback<Item>(){
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.volumeInfo.imageLinks.thumbnail == newItem.volumeInfo.imageLinks.thumbnail
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_book_preview,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val book = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(book.volumeInfo.imageLinks.thumbnail).into(item_image_book)
            item_book_title.text = book.volumeInfo.title
            item_authors.text = book.volumeInfo.authors.toString()
            item_description.text = book.volumeInfo.description

            setOnClickListener {
                onItemClickListener?.let { it(book) }
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((Item) -> Unit)? = null

    fun setOnItemClickListener(listener: (Item) -> Unit){
        onItemClickListener = listener
    }
}