package com.luoye.updater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UpdaterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Updater().update(this, intent)
    }
}
