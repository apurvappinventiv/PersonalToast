package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PersonalToast(var context: Context) {
    fun AppCompatActivity.ShowPersonalToast(msz: String) {
        Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
    }

    fun ShowPersonalToast(msz: String) {
        Toast.makeText(context, msz, Toast.LENGTH_LONG).show()
    }
}
