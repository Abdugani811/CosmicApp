package com.example.cosmicapp.Fragment

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.cosmicapp.R


import com.example.cosmicapp.databinding.FragmentInnerPageEarthBinding

class InnerPageEarthFragment : Fragment(R.layout.fragment_inner_page_earth) {
    private var _binding: FragmentInnerPageEarthBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInnerPageEarthBinding.bind(view)

        binding.backIV.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}