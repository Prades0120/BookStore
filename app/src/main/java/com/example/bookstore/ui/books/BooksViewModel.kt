package com.example.bookstore.ui.books

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bookstore.R

class BooksViewModel : ViewModel() {

    private val listOfBooks = MutableLiveData<ArrayList<Book>>().apply {
        val list = ArrayList<Book>()
        list.add(Book(R.drawable.book1, R.string.ines_panas, R.string.morir_ines_panas,22))
        list.add(Book(R.drawable.book2, R.string.santiago, R.string.yo_julia,18))
        list.add(Book(R.drawable.book3, R.string.carlos_lopez, R.string.carlos_lopez_book,7))
        list.add(Book(R.drawable.book4, R.string.antonio_muñoz, R.string.pasos_en_escalera,12))
        list.add(Book(R.drawable.book5, R.string.stephen_king, R.string.cementerio_animales,25))
        list.add(Book(R.drawable.book6, R.string.perez_reverte, R.string.sidi,21))
        list.add(Book(R.drawable.book7, R.string.camila_lackberg, R.string.jaula_de_oro,16))
        list.add(Book(R.drawable.book8, R.string.albert_espinosa, R.string.lo_mejor_de_ir,14))
        value = list
    }
    val list = listOfBooks
}