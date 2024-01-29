package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class PersonalToast {
    fun Context.ShowPersonalToast(msz: String) {
        Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
    }
}
