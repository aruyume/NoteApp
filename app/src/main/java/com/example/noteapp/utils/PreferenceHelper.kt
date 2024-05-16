package com.example.noteapp.utils

import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper {

    private lateinit var sharedPreferences: SharedPreferences

    fun unit(context: Context) {
        sharedPreferences = context.getSharedPreferences(
            "shared", Context.MODE_PRIVATE
        )
    }

    var title: String?
        get() = sharedPreferences.getString("title", "")
        set(value) = sharedPreferences.edit().putString("title", value)!!.apply()

    var isOnBoardShow: Boolean
        get() = sharedPreferences.getBoolean("board", false)
        set(value) = sharedPreferences.edit().putBoolean("board", value).apply()
}