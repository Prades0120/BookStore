package com.example.bookstore.ui.synopsis

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SynopsisViewModel : ViewModel() {

    private val listOfBooks = MutableLiveData<ArrayList<String>>().apply {
        val list = ArrayList<String>()
        list.add("Morir no es lo que más duele")
        list.add("Yo, Julia")
        list.add("La vida en cuatro letras")
        list.add("Tus pasos en la escalera")
        list.add("Cementerio de animales")
        list.add("Sidi")
        list.add("Una jaula de oro")
        list.add("Lo mejor de ir es volver")
        value = list
    }
    val list = listOfBooks
}