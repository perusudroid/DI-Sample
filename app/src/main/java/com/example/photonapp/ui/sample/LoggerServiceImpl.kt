package com.example.photonapp.ui.sample

import android.util.Log

class LoggerServiceImpl : LoggerService {
    override fun log(data : String?) {
        Log.d("LoggerServiceImpl", "log: $data")
    }
}