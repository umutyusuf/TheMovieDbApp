package com.umut.themoviedbapp.ui.extensions

import android.content.Context
import com.umut.themovieapp.common.error.CoreAppException
import com.umut.themovieapp.common.error.Error
import com.umut.themoviedbapp.ui.R

fun Throwable.getError(context: Context): Error =
    if (this is CoreAppException) {
        error
    } else {
        Error(Error.GENERAL_ERROR_CODE, context.getString(R.string.error_general))
    }
