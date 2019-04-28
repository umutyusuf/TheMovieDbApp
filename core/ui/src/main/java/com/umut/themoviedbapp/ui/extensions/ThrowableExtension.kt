package com.umut.themoviedbapp.ui.extensions

import com.umut.themovieapp.common.error.CoreAppException
import com.umut.themovieapp.common.error.Error
import com.umut.themovieapp.common.message.TextValue
import com.umut.themoviedbapp.ui.R

fun Throwable.getError(): Error =
    if (this is CoreAppException) {
        error
    } else {
        Error(textValue = TextValue.buildFromResource(R.string.error_general))
    }
