package com.ferrero.app.rfkrfkofror

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.ferrero.app.mainclas.GoodClass.Companion.APPSsssss
import com.ferrero.app.utils.Jjjtgtghu
import com.ferrero.app.utils.CountryRepo
import com.ferrero.app.utils.DevRepo
import com.ferrero.app.utils.Jfrhfrrf
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.firebase.analytics.FirebaseAnalytics
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(
    private val gtghhyhyhyhy: CountryRepo,
    private val cdvfffrgtgtgt: DevRepo,
    private val vfbggthyhy: SharedPreferences,
    val bbggbbghyhy: Application
) : ViewModel() {


    private val gtgtggt = MutableLiveData<Jfrhfrrf>()
    val ggtgtgtgtthyhy: LiveData<Jfrhfrrf>
        get() = gtgtggt

    private val vgbggbbgbggbg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val ggtgtgtgtgt = data?.get("campaign").toString()
            _appsDataaaaaaa56d56.postValue(ggtgtgtgtgt)

            val hyhjuujjujuju = Bundle()
            val instanceeeeeeee = FirebaseAnalytics.getInstance(bbggbbghyhy.applicationContext)
            var strtrrrrrrrr = "opened_firstly"


            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search").logEvent(bbggbbghyhy.applicationContext)
                    strtrrrrrrrr = "first_open_s"
                    instanceeeeeeee.logEvent(strtrrrrrrrr, hyhjuujjujuju)

                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube").logEvent(bbggbbghyhy.applicationContext)
                    strtrrrrrrrr = "first_open_y"
                    instanceeeeeeee.logEvent(strtrrrrrrrr, hyhjuujjujuju)


                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display").logEvent(bbggbbghyhy.applicationContext)
                    strtrrrrrrrr = "first_open_d"
                    instanceeeeeeee.logEvent(strtrrrrrrrr, hyhjuujjujuju)
                }

                else ->{

                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel").logEvent(bbggbbghyhy.applicationContext)
                }

            }

            instanceeeeeeee.logEvent(strtrrrrrrrr, hyhjuujjujuju)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    private val _appsDataaaaaaa56d56 = MutableLiveData<String>()
    val appsDatagtgt65tggt: LiveData<String>
        get() = _appsDataaaaaaa56d56

    private val _deepSfrrf56fr5fr5 = MutableLiveData<String>()
    val deepS: LiveData<String>
        get() = _deepSfrrf56fr5fr5

    suspend fun gttghyhyhyhy() {
        fr5rf5rf5.postValue(gtghhyhyhyhy.getDattttttttt().body())
        deedcsssd()
    }

    suspend fun deedcsssd() {
        gtgtggt.postValue(cdvfffrgtgtgt.getDataDevvvvvvvv().body())
    }



    private val gttggt5gt5tg = MutableLiveData<Jjjtgtghu>()
    val data: LiveData<Jjjtgtghu>
        get() = gttggt5gt5tg


    private val fr5rf5rf5 = MutableLiveData<Jjjtgtghu>()
    val countryCodefrfrrfrffr6: LiveData<Jjjtgtghu>
        get() = fr5rf5rf5


    private val _mainIddededdeeded = MutableLiveData<String?>()
    val frrfrffrfrrf: LiveData<String?>
        get() = _mainIddededdeeded

    init {
        viewModelScope.launch(Dispatchers.IO) {
            gtjjgtgtjjgtijgtjigt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            gttghyhyhyhy()
        }
    }


    fun vfbggbbgbggb(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(APPSsssss, vgbggbbgbggbg, bbggbbghyhy)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun gtjjgtgtjjgtijgtjigt() {
        val vbghgthgthhgt = AdvertisingIdClient(bbggbbghyhy)
        vbghgthgthhgt.start()
        val gjjgtijigtjjgtjgt = vbghgthgthhgt.info.id.toString()
        _mainIddededdeeded.postValue(gjjgtijigtjjgtjgt)
    }

    fun ccvvvbbbb(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val vfvbggbbgbg = data.targetUri?.host.toString()
                vfbggthyhy.edit().putString("deepSt", vfvbggbbgbg).apply()
            }
        }
    }

}