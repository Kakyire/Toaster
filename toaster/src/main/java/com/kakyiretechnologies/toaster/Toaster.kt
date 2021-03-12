package com.kakyiretechnologies.toaster

import android.app.Activity
import android.widget.Toast
import androidx.fragment.app.Fragment

private const val SOMETHING_WENT_WRONG = "Something went wrong. Try again"

fun Activity.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.shortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Activity.errorToast() {
    Toast.makeText(this, SOMETHING_WENT_WRONG, Toast.LENGTH_SHORT).show()
}


fun Fragment.longToast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
}

fun Fragment.shortToast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
}

fun Fragment.errorToast() {
    Toast.makeText(requireContext(), SOMETHING_WENT_WRONG, Toast.LENGTH_SHORT).show()
}



