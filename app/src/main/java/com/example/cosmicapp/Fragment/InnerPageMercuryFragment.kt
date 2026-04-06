package com.example.cosmicapp.Fragment

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.cosmicapp.R


class InnerPageMercuryFragment : Fragment(R.layout.fragment_inner_page_mercury) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backIV2 = view.findViewById<ImageView>(R.id.backIV2)
        backIV2.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}