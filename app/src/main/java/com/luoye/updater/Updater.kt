package com.luoye.updater

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.RecoverySystem
import android.util.Log
import java.io.File

const val TAG = "Updater"
const val RECOVERY_ACTION = "com.luoye.updater.action.ACTION_ROM_UPDATE"
const val PACKAGE_PATH = "package_path"

class Updater {
    fun update(context: Context?, intent: Intent?) {
        Log.d(TAG, "Receive intent!")
        if (intent?.action == RECOVERY_ACTION) {
            val installPackage = File(intent.getStringExtra(PACKAGE_PATH))
            if (installPackage.exists() && installPackage.isFile) {
                Log.d(TAG, "Prepare update!")
                RecoverySystem.installPackage(context, installPackage)
            }
        }
    }
}