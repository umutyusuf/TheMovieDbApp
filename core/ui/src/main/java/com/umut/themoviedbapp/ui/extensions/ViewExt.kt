package com.umut.themoviedbapp.ui.extensions

import android.widget.TextView
import androidx.annotation.StringRes

fun TextView.setResText(@StringRes textRes: Int, vararg params: Any?) {
    text = context.getString(textRes, *params)
}