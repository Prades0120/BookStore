package com.example.bookstore.ui.books

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookstore.R
import com.example.bookstore.databinding.FragmentBooksBinding

class BooksFragment : Fragment() {

    private lateinit var booksViewModel: BooksViewModel
    private var _binding: FragmentBooksBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        booksViewModel =
            ViewModelProvider(this)[BooksViewModel::class.java]

        _binding = FragmentBooksBinding.inflate(inflater, container, false)
        val root: View = binding.root
        booksViewModel.list.observe(viewLifecycleOwner, Observer {
            val recView = binding.root.findViewById<RecyclerView>(R.id.recyclerViewBooks)

            recView.setHasFixedSize(true)

            val adaptador = BooksAdapter(it)
            recView.adapter = adaptador
            recView.layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.VERTICAL, false)
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}