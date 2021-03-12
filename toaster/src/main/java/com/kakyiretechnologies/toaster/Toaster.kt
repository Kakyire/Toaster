package com.kakyiretechnologies.toaster

import android.widget.Toast
import androidx.fragment.app.FragmentActivity

private const val SOMETHING_WENT_WRONG = "Something went wrong. Try again"

fun FragmentActivity.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun FragmentActivity.shortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun FragmentActivity.errorToast() {
    Toast.makeText(this, SOMETHING_WENT_WRONG, Toast.LENGTH_SHORT).show()
}




