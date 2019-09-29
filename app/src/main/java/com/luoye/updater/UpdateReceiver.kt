package com.luoye.updater

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.RecoverySystem
import android.util.Log
import java.io.File

class UpdateReceiver : BroadcastReceiver(){
    var TAG = "UpdateReceiver"
    var RECOVERY_ACTION ="com.luoye.updater.action.ROM_UPDATE_ACTION"
    var  PACKAGE_PATH = "package_path"
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(TAG,"Receive broadcast!")
        if(intent?.action == RECOVERY_ACTION){
            var installPackage = File(intent.getStringExtra(PACKAGE_PATH))
            if(installPackage.exists()){
                Log.d(TAG,"Prepare update!")
                RecoverySystem.installPackage(context,installPackage)
            }
        }
    }
}