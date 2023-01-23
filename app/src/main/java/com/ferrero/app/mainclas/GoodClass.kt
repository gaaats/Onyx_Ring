package com.ferrero.app.mainclas

import android.app.Application
import android.content.Context
import com.ferrero.app.sevice.appModulefrrffrrf
import com.ferrero.app.sevice.hyhjuujujujjuuj
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class GoodClass:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(oneeeeeees)
        Branch.enableTestMode()

        Branch.getAutoInstance(this)

        val frrfrfrffrrf = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingssssssss = getSharedPreferences("PREFS_NAME", 0)

        val trackerParamsssssss = MyTracker.getTrackerParams()
        val nhnhhnnhnh = MyTracker.getTrackerConfig()

        val instIDsdddd = MyTracker.getInstanceId(this)
        nhnhhnnhnh.isTrackingLaunchEnabled = true


        if (settingssssssss.getBoolean("my_first_time", true)) {

            frrfrfrffrrf.edit().putString(instIdfrfrf, instIDsdddd).apply()
            settingssssssss.edit().putBoolean("my_first_time", false).apply()
        } else {

        }
        MyTracker.initTracker(trackerrrrr, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@GoodClass)
            modules(
                listOf(
                    hyhjuujujujjuuj, appModulefrrffrrf
                )
            )
        }
    }


    companion object {

        val deepLlllll: String = "deepL"
        var AIR_BALANCEfrrfrfrf = 500
        var defaultValueeeeeee = "null"
        var instIdfrfrf: String? = "instID"
        var urlMainfrrffr: String = "link"
        const val oneeeeeees = "599d12b4-de9f-4c44-8be5-8bdb064946a7"
        const val pppppppppapapap = "com.ferrero.ap"
        const val trackerrrrr = "53740539996101226576"
        const val APPSsssss = "cBTkLTfkyHndKVjZhPAQcC"
        val myIdfrrrfrf: String = "myID"
        var MAIN_IDfrrfrf: String? = "main_id"
        var aps_iddddddaaa: String? = "main_id"
        var C1frrfrf: String? = "c11"
        const val myTrIdfrfrrf = ""
        val appsCheckChefrfrfrf: String = "appsCheckChe"
        val geoCoffffff: String = "geoCo"
        val codeCodeeeeeee: String = "uff"
    }
}