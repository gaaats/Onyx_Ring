package com.ferrero.app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ferrero.app.R
import com.ferrero.app.databinding.FragmentD1Binding
import com.google.android.material.snackbar.Snackbar


class D1Fragment : Fragment() {
    private fun gtjgtgtjijtgijtgjtjgi() {
        findNavController().navigate(R.id.action_d1Fragment_to_d2Fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentD1Binding = FragmentD1Binding.inflate(inflater, container, false)
        return binding.root
    }

    var fragmentD1Binding: FragmentD1Binding? = null
    val binding
        get() = fragmentD1Binding ?: throw RuntimeException("FragmentD1Binding = null")


    private fun rogtjgjijtjitgijgt() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            binding.btnPlayGame.setOnClickListener {
                gtjgtgtjijtgijtgjtjgi()
            }

        } catch (e: Exception) {
            rogtjgjijtjitgijgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }



    override fun onDestroy() {
        fragmentD1Binding = null
        super.onDestroy()
    }
}