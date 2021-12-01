package com.example.bookstore.ui.books

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.bookstore.R

class BooksAdapter(private var items: ArrayList<Book>): Adapter<BooksAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val image: ImageView = itemView.findViewById(R.id.imageView)
        private val titulo: TextView = itemView.findViewById(R.id.textView)
        private val autor: TextView = itemView.findViewById(R.id.textView2)
        private val precio: TextView = itemView.findViewById(R.id.textView3)

        @SuppressLint("SetTextI18n")
        fun bindBook(b: Book) {
            image.setImageResource(b.image)
            titulo.setText(b.titulo)
            autor.setText(b.autor)
            precio.text = b.precio.toString()+"€"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val item = items[position]
        holder.bindBook(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}