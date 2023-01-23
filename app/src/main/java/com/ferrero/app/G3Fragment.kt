package com.ferrero.app


import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ferrero.app.databinding.FragmentG3Binding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay


class G3Fragment : Fragment() {

    private fun fbhvfbhvffrvfrvvrf() {
        Toast.makeText(requireContext(), "Loading...", Toast.LENGTH_SHORT).show()
    }

    private fun gojjgtijgtjjgti() {
        tggthuigthgtihgtgttgut()
    }

    private fun tggthuigthgtihgtgttgut() {
        findNavController().navigate(R.id.action_g3Fragment_to_d2Fragment)
    }


    override fun onDestroy() {
        fragmentG3Binding = null
        super.onDestroy()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentG3Binding = FragmentG3Binding.inflate(inflater, container, false)
        return binding.root
    }

    var fragmentG3Binding: FragmentG3Binding? = null
    val binding
        get() = fragmentG3Binding ?: throw RuntimeException("FragmentG3Binding = null")


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
            gotjogitojgjtjgjgt()



        } catch (e: Exception) {
            rogtjgjijtjitgijgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gotjogitojgjtjgjgt() {
        lifecycleScope.launchWhenCreated {
            gtgthgtuihgthihghiugt()
            delay(2500)
            gojjgtijgtjjgti()
        }
    }

    private fun gtgthgtuihgthihghiugt() {
        fbhvfbhvffrvfrvvrf()
    }


}