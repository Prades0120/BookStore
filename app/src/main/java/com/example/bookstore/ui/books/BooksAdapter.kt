package com.example.bookstore.ui.books

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.bookstore.R

class BooksAdapter(var items: ArrayList<Book>): Adapter<BooksAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        fun bindBook(b: Book) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}