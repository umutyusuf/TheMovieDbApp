package com.umut.themoviedbapp.ui.extensions

import android.app.AlertDialog
import android.content.Context
import com.umut.themovieapp.common.error.Error
import com.umut.themoviedbapp.ui.R

fun Context.alertError(error: Error) {
    with(AlertDialog.Builder(this)) {
        setTitle(R.string.error_dialog_title)
        setMessage(error.errorMessage)
        setPositiveButton(R.string.ok) { dialog, _ -> dialog.dismiss() }
        show()
    }
}