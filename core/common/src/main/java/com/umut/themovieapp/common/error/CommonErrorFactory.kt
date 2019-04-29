package com.umut.themovieapp.common.error

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Default implementation of ErrorFactory.
 */
@Singleton
class CommonErrorFactory @Inject
constructor() : ErrorFactory {

    override fun populateError(errorMessage: String): Error {
        return Error(Error.GENERAL_ERROR_CODE, errorMessage)
    }

    override fun populateError(errorCode: Int?, errorMessage: String): Error {
        val validErrorCode = errorCode ?: Error.GENERAL_ERROR_CODE
        return Error(validErrorCode, errorMessage)
    }

    override fun populateError(t: Throwable): Error {
        return Error(Error.INTERNAL_ERROR_CODE, t.message ?: "")
    }
}