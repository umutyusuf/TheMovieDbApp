package com.umut.themoviedbapp.ui.message

import android.content.Context
import com.umut.domain.message.MessageProvider
import com.umut.themovieapp.common.error.Error
import com.umut.themoviedbapp.ui.R

abstract class DefaultMessageProvider(
    private val context: Context
) : MessageProvider {

    override fun getMessageForCode(code: Int) =
        when (code) {
            Error.INTERNAL_ERROR_CODE -> context.getString(R.string.internal_error)
            else -> null
        }

}