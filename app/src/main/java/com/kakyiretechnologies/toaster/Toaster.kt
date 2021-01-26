package com.kakyiretechnologies.toaster

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun longToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }

        fun shortToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}