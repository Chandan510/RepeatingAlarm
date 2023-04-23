package com.era.alarmsample

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import com.era.alarmsample.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Calendar


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    val repeatingTime:Long = 604800000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

        val intent = Intent(this, MyReceiver::class.java)

        val pi: PendingIntent = PendingIntent.getBroadcast(this, 1000, intent, 0)


        // Sunday

        binding!!.btnSun.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_WEEK,1)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )
            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


        // Monday

        binding!!.btnMonday.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set((Calendar.DAY_OF_WEEK),2)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )
            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


        // Tuesday

        binding!!.btnTue.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_WEEK,3)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )
            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


        // Wednesday

        binding!!.btnWed.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_WEEK,4)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )
            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


        // Thursday

        binding!!.btnThur.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_WEEK,5)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )
            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


        // Friday

        binding!!.btnFri.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_WEEK,6)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )
            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


        // Saturday

        binding!!.btnSat.setOnClickListener{
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_WEEK,7)
            cal.set(Calendar.HOUR, 9)
            cal.set(Calendar.MINUTE, 0)
            val initialTime = cal.timeInMillis+repeatingTime
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, initialTime , repeatingTime, pi
            )

            Log.e("@@", "Started from : ${initialTime} ---- Next alarm: ${initialTime+repeatingTime}")
        }


    }



}