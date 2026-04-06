package com.example.cosmicapp.Fragment

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.cosmicapp.R

class InnerPageVenusFragment : Fragment(R.layout.fragment_inner_page_venus) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backIV3 = view.findViewById<ImageView>(R.id.backIV3)
        backIV3.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}