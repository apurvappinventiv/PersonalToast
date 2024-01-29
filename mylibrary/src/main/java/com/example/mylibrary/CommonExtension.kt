package com.example.mylibrary

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable

/*
* Extension function to start and finish an activity with data.
* */
inline fun <reified T : Activity> Activity.startAndFinishActivity(vararg data: Pair<String, Any>) {
    startActivity(Intent(this, T::class.java).apply {
        putExtras(Bundle().apply {
            for ((key, value) in data) {
                when (value) {
                    is Int -> putInt(key, value)
                    is Boolean -> putBoolean(key, value)
                    is String -> putString(key, value)
                    is Parcelable -> putParcelable(key, value) // Handle Parcelable data
                    // Add other data types if needed
                }
            }
        })
    })
}
