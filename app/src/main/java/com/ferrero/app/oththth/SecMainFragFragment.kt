package com.ferrero.app.oththth

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


class SecMainFragFragment : Fragment() {
    lateinit var hyhyhyhy: String
    private lateinit var mContexttttttttttt: Context

    val shareP: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    val bhnhhnhnnh by activityViewModel<ViMod>(named("MainModel"))
    lateinit var countryDevfrrfrf: String
    lateinit var wvfrrfrfrf: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sec_main_frag, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContexttttttttttt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bhnhhnhnnh.frrfrffrfrrf.observe(viewLifecycleOwner) {
            if (it != null) {
                val juujujuj = it.toString()
                shareP.edit().putString("mainId", juujujuj).apply()
            }
        }

        bhnhhnhnnh.ggtgtgtgtthyhy.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDevfrrfrf = it.geoooo
                hyhyhyhy = it.appsCheckerrrrr
                wvfrrfrfrf = it.viewvvv

                jgtigtjtgjgtjigtjgt()
                shareP.edit().putString("apps", hyhyhyhy).apply()
                shareP.edit().putString("wv", wvfrrfrfrf).apply()

                gttkgttgjigtjgtgtji()
            }
        }
    }

    private fun jgtigtjtgjgtjigtjgt() {
        shareP.edit().putString("countryDev", countryDevfrrfrf).apply()
    }

    private fun gttkgttgjigtjgtgtji() {
        gtgtgtjgtijtgjigtjjgt()
    }

    private fun gtgtgtjgtijtgjigtjjgt() {
        findNavController().navigate(R.id.action_secMainFragFragment_to_befooorFragment)
    }
}