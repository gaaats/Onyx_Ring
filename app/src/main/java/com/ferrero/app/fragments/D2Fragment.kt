package com.ferrero.app.fragments


import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.ferrero.app.R
import com.ferrero.app.databinding.FragmentD2Binding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlin.random.Random

class D2Fragment : Fragment() {

    private val listBindd by lazy {
        listOf(
            binding.imgElem1gtgtgtgtgt,
            binding.imgElem2gtgtgtgt,
            binding.imgElem3gtgtgtgttgtgtgtgt,
            binding.imgElem4gtgtgtgtgt,
            binding.imgElem5gtgttggt,
            binding.imgElem6ggtgtgthyjuuj,
        )
    }

    private fun makeDone() {
        listBindd.forEach {
            listBindd.forEach {
                it.contentDescription = "done"
            }
        }
    }

    private fun makeNotEnabled() {
        listBindd.forEach {
            listBindd.forEach {
                it.isEnabled = false
            }
        }
    }

    private fun makeEnabled() {
        listBindd.forEach {
            listBindd.forEach {
                it.isEnabled = true
            }
        }
    }

    private fun makeClear() {
        listBindd.forEach {
            listBindd.forEach {
                it.contentDescription = "no"
            }
        }
    }

    private fun setImage() {
        listBindd.forEach {
            listBindd.forEach {
                if (it.contentDescription == "no") {
                    it.setImageResource(R.drawable.giiiiiift)
                }
                if (it.contentDescription == "done") {
                    it.setImageDrawable(null)
                }
            }
        }
    }

    private fun makeCheckkk(): Boolean {
        listBindd.forEach {
            if (it.contentDescription == "no") return false
        }
        return true
    }

    private fun gtjgtgtjijtgijtgjtjgi() {
        findNavController().navigate(R.id.action_d1Fragment_to_d2Fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentD2Binding = FragmentD2Binding.inflate(inflater, container, false)
        return binding.root
    }

    var fragmentD2Binding: FragmentD2Binding? = null
    val binding
        get() = fragmentD2Binding ?: throw RuntimeException("FragmentD2Binding = null")


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

            makeClear()
            setImage()

            binding.btnnexxxxt.setOnClickListener {
                findNavController().navigate(R.id.action_d2Fragment_to_g3Fragment)
            }

            binding.imgElem1gtgtgtgtgt.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 3500)
                lifecycleScope.launchWhenCreated {
                    Toast.makeText(requireContext(), "Earned ${number}!", Toast.LENGTH_SHORT).show()
                    makeNotEnabled()
                    binding.imgElem1gtgtgtgtgt.setImageDrawable(null)
                    delay(2500)
                    makeEnabled()
                }
            }

            binding.imgElem2gtgtgtgt.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 3500)
                lifecycleScope.launchWhenCreated {
                    Toast.makeText(requireContext(), "Earned ${number}!", Toast.LENGTH_SHORT).show()
                    makeNotEnabled()
                    binding.imgElem2gtgtgtgt.setImageDrawable(null)
                    delay(2500)
                    makeEnabled()
                }
            }
            binding.imgElem3gtgtgtgttgtgtgtgt.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 3500)
                lifecycleScope.launchWhenCreated {
                    Toast.makeText(requireContext(), "Earned ${number}!", Toast.LENGTH_SHORT).show()
                    makeNotEnabled()
                    binding.imgElem3gtgtgtgttgtgtgtgt.setImageDrawable(null)
                    delay(2500)
                    makeEnabled()
                }
            }
            binding.imgElem4gtgtgtgtgt.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 3500)
                lifecycleScope.launchWhenCreated {
                    Toast.makeText(requireContext(), "Earned ${number}!", Toast.LENGTH_SHORT).show()
                    makeNotEnabled()
                    binding.imgElem4gtgtgtgtgt.setImageDrawable(null)
                    delay(2500)
                    makeEnabled()
                }
            }
            binding.imgElem5gtgttggt.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 3500)
                lifecycleScope.launchWhenCreated {
                    Toast.makeText(requireContext(), "Earned ${number}!", Toast.LENGTH_SHORT).show()
                    makeNotEnabled()
                    binding.imgElem5gtgttggt.setImageDrawable(null)

                    delay(2500)
                    makeEnabled()
                }
            }
            binding.imgElem6ggtgtgthyjuuj.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 3500)
                lifecycleScope.launchWhenCreated {
                    Toast.makeText(requireContext(), "Earned ${number}!", Toast.LENGTH_SHORT).show()
                    makeNotEnabled()
                    binding.imgElem6ggtgtgthyjuuj.setImageDrawable(null)

                    delay(2500)
                    makeEnabled()
                }
            }




        } catch (e: Exception) {
            rogtjgjijtjitgijgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroy() {
        fragmentD2Binding = null
        super.onDestroy()
    }
}