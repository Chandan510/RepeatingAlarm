package com.era.alarmsample


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import java.text.SimpleDateFormat
import java.util.*


class MyReceiver: BroadcastReceiver() {

    lateinit var mp:MediaPlayer

    override fun onReceive(p0: Context?, p1: Intent?) {



        mp = MediaPlayer.create(p0, android.provider.Settings.System.DEFAULT_ALARM_ALERT_URI)
        mp.start()

    }
}