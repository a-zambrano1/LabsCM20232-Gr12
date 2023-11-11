package com.example.owl.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val serviceIntent = Intent(context, NotificationIntentService::class.java)
        context?.startService(serviceIntent)
    }
}
