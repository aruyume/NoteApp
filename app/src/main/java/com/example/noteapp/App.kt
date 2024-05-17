package com.example.noteapp

import PreferenceHelper
import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceHelper(this)
        sharedPreferences.unit(this)
    }
}
