package com.example.bookstore.ui.synopsis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bookstore.R
import com.example.bookstore.databinding.FragmentSynopsisBinding

class SynopsisFragment : Fragment() {

    private lateinit var synopsisViewModel: SynopsisViewModel
    private var _binding: FragmentSynopsisBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        synopsisViewModel =
            ViewModelProvider(this)[SynopsisViewModel::class.java]

        _binding = FragmentSynopsisBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val autoComplete: AutoCompleteTextView = root.findViewById(R.id.autoCompleteTextView)
        val synopsis: TextView = root.findViewById(R.id.textView6)

       synopsisViewModel.list.observe(viewLifecycleOwner, {
           val adapter = ArrayAdapter (root.context,android.R.layout.simple_dropdown_item_1line,it)
           autoComplete.setAdapter(adapter)
           autoComplete.threshold = 1
        })

        autoComplete.setOnItemClickListener { _, _, _, _ ->
            when (autoComplete.text.toString()) {
                getString(R.string.morir_ines_panas) -> synopsis.setText(R.string.synopsis0)
                getString(R.string.yo_julia) -> synopsis.setText(R.string.synopsis1)
                getString(R.string.carlos_lopez_book) -> synopsis.setText(R.string.synopsis2)
                getString(R.string.pasos_en_escalera) -> synopsis.setText(R.string.synopsis3)
                getString(R.string.cementerio_animales) -> synopsis.setText(R.string.synopsis4)
                getString(R.string.sidi) -> synopsis.setText(R.string.synopsis5)
                getString(R.string.jaula_de_oro) -> synopsis.setText(R.string.synopsis6)
                getString(R.string.lo_mejor_de_ir) -> synopsis.setText(R.string.synopsis7)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}