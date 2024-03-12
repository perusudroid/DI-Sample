package com.example.photonapp.ui

import com.example.photonapp.ui.sample.LoggerService

class Helper(val loggerService: LoggerService) {

    fun getTodayDate() = System.currentTimeMillis()

    fun printSomething(){
        loggerService.log("Message from Helper")
    }

}