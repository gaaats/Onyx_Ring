package com.ferrero.app.cont

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ferrero.app.R
import com.ferrero.app.rfkrfkofror.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class M1Fragment : Fragment() {
    val gttggtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    val gtgthyhyhyyhhyhyhy by activityViewModel<ViMod>(named("MainModel"))



    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgfgtgtgtgt=context
    }
    private lateinit var mContextgfgtgtgtgt: Context
    lateinit var gtgtgtgtgtgt: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtgthyhyhyyhhyhyhy.ccvvvbbbb(mContextgfgtgtgtgt)

        gigtjojgtjgtjgtjgt()

    }

    private fun gigtjojgtjgtjgtjgt() {
        gtojgtjgtjjgtijgt()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_m1, container, false)
    }

    private fun gtojgtjgtjjgtijgt() {
        findNavController().navigate(R.id.action_m1Fragment_to_contryyyyyFragment)
    }
}