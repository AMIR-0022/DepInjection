package com.example.depinjection.services

import android.util.Log
import javax.inject.Inject

class LoggerServices @Inject constructor(){

    fun log (message: String) {
        Log.d("User", message)
    }

}