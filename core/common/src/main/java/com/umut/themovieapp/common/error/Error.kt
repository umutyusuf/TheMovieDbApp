package com.umut.themovieapp.common.error

import com.umut.themovieapp.common.message.TextValue

data class Error(val errorCode: Int? = null, val textValue: TextValue?) {
    companion object {
        const val GENERAL_ERROR_CODE = 500
        const val INTERNAL_ERROR_CODE = -1
        const val EMPTY_RESPONSE_TEXT_CODE = -2
        const val EMPTY_RESPONSE = "THEMOVIEAPP_EMPTY_RESPONSE"
    }
}