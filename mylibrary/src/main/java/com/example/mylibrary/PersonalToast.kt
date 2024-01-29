package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.widget.Toast

class PersonalToast {
    fun Context.ShowPersonalToast(msz: String) {
        Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
    }

    fun Activity.ShowPersonalToast(msz: String) {
        Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
    }
}
