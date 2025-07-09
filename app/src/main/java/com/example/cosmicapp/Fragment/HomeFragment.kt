package com.example.cosmicapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cosmicapp.R
import com.example.cosmicapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mercuryLL.setOnClickListener {
            findNavController().navigate(com.example.cosmicapp.R.id.action_homeFragment_to_innerPageMercuryFragment)
        }
        binding.profileImageView1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
        binding.venusLL.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_innerPageVenusFragment)
        }
        binding.earthLL.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_innerPageEarthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}