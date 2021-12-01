package com.example.bookstore.ui.synopsis

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookstore.R
import com.example.bookstore.ui.books.Book
import kotlin.coroutines.coroutineContext

class SynopsisViewModel : ViewModel() {

    private val listOfBooks = MutableLiveData<ArrayList<String>>().apply {
        val list = ArrayList<String>()
        value = list
    }
    val list = listOfBooks
}