package com.umut.themovieapp.common.error

data class Error(val errorCode: Int? = null, val errorMessage: String) {
    companion object {
        const val GENERAL_ERROR_CODE = 500
        const val INTERNAL_ERROR_CODE = -1
        const val EMPTY_RESPONSE_CODE = -2
    }
}