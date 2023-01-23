package com.ferrero.app.cont

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferrero.app.R

class GaamerGamerActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaamer_gamer2)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        onDestroy()
    }
}