package com.ferrero.app.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ferrero.app.R
import com.ferrero.app.rfkrfkofror.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class ContryyyyyFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hyhjuujujkiikkiikkiik.countryCodefrfrrfrffr6.observe(viewLifecycleOwner) {
            if (it!=null) {
                country = it.cou
                gtgtgtgtgttggtgt.edit().putString("country", country).apply()
                gtkgtoijtgijtgjgtjgtgtijgt()
            }
        }
    }

    private fun gtkgtoijtgijtgjgtjgtgtijgt() {
        gtgtjgtjgtgtjgtjjgtgtj()
    }

    private fun gtgtjgtjgtgtjgtjjgtgtj() {
        findNavController().navigate(R.id.action_contryyyyyFragment_to_secMainFragFragment)
    }

    private lateinit var mContextfrfrrfrfrf: Context


    val gtgtgtgtgttggtgt: SharedPreferences by inject(named("SharedPreferences"))
    val hyhjuujujkiikkiikkiik by activityViewModel<ViMod>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contryyyyy, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextfrfrrfrfrf = context
    }


}