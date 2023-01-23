package com.ferrero.app.brovvv

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.ferrero.app.databinding.ActivityBrovserGoogleBinding
import com.ferrero.app.mainclas.GoodClass
import com.ferrero.app.mainclas.GoodClass.Companion.aps_iddddddaaa
import com.ferrero.app.vbbbbbbbbem.BeamModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class BrovserGoogleActivity : AppCompatActivity() {

    private var gkgttggtkgtk = false
    override fun onBackPressed() {

        if (jujukikikiikik.canGoBack()) {
            if (gkgttggtkgtk) {
                jujukikikiikik.stopLoading()
                jujukikikiikik.loadUrl(urlfififif)
            }
            this.gkgttggtkgtk = true
            jujukikikiikik.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                gkgttggtkgtk = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nhnhnhnhnh = ActivityBrovserGoogleBinding.inflate(layoutInflater)
        setContentView(nhnhnhnhnh.root)
        jujukikikiikik = nhnhnhnhnh.webst
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(jujukikikiikik, true)
        frokrfko.webSetfrrffrrfrfrf(jujukikikiikik)


        jujukikikiikik.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (frokrfko.hyhyjyjhijyhihyjhy(url)) {

                        val gtkgtkkgtkogt = Intent(Intent.ACTION_VIEW)
                        gtkgtkkgtkogt.data = Uri.parse(url)
                        startActivity(gtkgtkkgtkogt)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                saveUrlaaaa(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@BrovserGoogleActivity, description, Toast.LENGTH_SHORT).show()
            }
        }

        jujukikikiikik.webChromeClient = ChromeClientggtgtgtgt()
        jujukikikiikik.loadUrl(nhmjmjlmjko())
    }

    private lateinit var nhnhnhnhnh: ActivityBrovserGoogleBinding
    lateinit var jujukikikiikik: WebView

    private val gtjiogtjoiggtjjgt = 1
    private var hjujujuujuj: ValueCallback<Array<Uri>>? = null
    private var ggtgtgtgtgttg: String? = null


    private val frokrfko by viewModel<BeamModel>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != gtjiogtjoiggtjjgt || hjujujuujuj == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (ggtgtgtgtgttg != null) {
                    results = arrayOf(Uri.parse(ggtgtgtgtgttg))
                }
            } else {
                val ggtgtgttggt = data.dataString
                if (ggtgtgttggt != null) {
                    results = arrayOf(Uri.parse(ggtgtgttggt))
                }
            }
        }
        hjujujuujuj!!.onReceiveValue(results)
        hjujujuujuj = null
        return
    }


    inner class ChromeClientggtgtgtgt : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            hjujujuujuj?.onReceiveValue(null)
            hjujujuujuj = filePath
            var gtjitgjgtijgt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (gtjitgjgtijgt!!.resolveActivity(packageManager) != null) {
                var g5t5gg5t5gt: File? = null
                try {
                    g5t5gg5t5gt = gbnhnhnhnh()
                    gtjitgjgtijgt.putExtra("PhotoPath", ggtgtgtgtgttg)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (g5t5gg5t5gt != null) {
                    ggtgtgtgtgttg = "file:" + g5t5gg5t5gt.absolutePath
                    gtjitgjgtijgt.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(g5t5gg5t5gt)
                    )
                } else {
                    gtjitgjgtijgt = null
                }
            }
            val jhyjyihjhyjjhy = Intent(Intent.ACTION_GET_CONTENT)
            jhyjyihjhyjjhy.addCategory(Intent.CATEGORY_OPENABLE)
            jhyjyihjhyjjhy.type = "image/*"
            val jukikikikik: Array<Intent?> =
                gtjitgjgtijgt?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val jukiik5ik5 = Intent(Intent.ACTION_CHOOSER)
            jukiik5ik5.putExtra(Intent.EXTRA_INTENT, jhyjyihjhyjjhy)
            jukiik5ik5.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            jukiik5ik5.putExtra(Intent.EXTRA_INITIAL_INTENTS, jukikikikik)
            startActivityForResult(jukiik5ik5, gtjiogtjoiggtjjgt)
            return true
        }

        fun gbnhnhnhnh(): File? {
            val gtuhgthgtgt = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val vfbfvbhgfrgygfrrf = "JPEG_" + gtuhgthgtgt + "_"
            val yhlhylgtkfrjgdegedfsdtf = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                vfbfvbhgfrgygfrrf,
                ".jpg",
                yhlhylgtkfrjgdegedfsdtf
            )
        }
    }

    private fun nhmjmjlmjko(): String {

        val gt5gt5gtgttg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val gtgt5gt5gt5 = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val vhjbbvbfvbfv = gtgt5gt5gt5.getString("link", null)
        val myTrIdaaaaaa = gtgt5gt5gt5.getString(GoodClass.instIdfrfrf, null)
        val afIdaaaaaaa = gtgt5gt5gt5.getString(aps_iddddddaaa, null)

        val interdaaaaaaaa = gtgt5gt5gt5.getString("WebInt", null)


        when (interdaaaaaaaa) {
            "campaign" -> {
                frokrfko.gtgtigtjijgtjgtgtigti(afIdaaaaaaa.toString())
            }
            "deepLink" -> {
                frokrfko.gtgtigtjijgtjgtgtigti(afIdaaaaaaa.toString())
            }
            "deepLinkNOApps" -> {
                frokrfko.gtgtigtjijgtjgtgtigti(myTrIdaaaaaa.toString())
            }
            "geo" -> {
                frokrfko.gtgtigtjijgtjgtgtigti(myTrIdaaaaaa.toString())
            }

        }
        Log.d("lolo", "link is ${vhjbbvbfvbfv}")
        return gt5gt5gtgttg.getString("SAVED_URL", vhjbbvbfvbfv).toString()
    }

    var urlfififif = ""
    fun saveUrlaaaa(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }


}

