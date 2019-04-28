package com.umut.themovieapp.common.error

import com.umut.themovieapp.common.text.TextValue
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Default implementation of ErrorFactory.
 */
@Singleton
class CommonErrorFactory @Inject
constructor() : ErrorFactory {

    override fun populateError(errorMessage: String): Error {
        return Error(Error.GENERAL_ERROR_CODE, TextValue.buildFromText(errorMessage))
    }

    override fun populateError(errorCode: Int?, errorMessage: String): Error {
        return Error(errorCode ?: Error.GENERAL_ERROR_CODE, TextValue.buildFromText(errorMessage))
    }

    override fun populateError(t: Throwable): Error {
        return Error(Error.INTERNAL_ERROR_CODE, TextValue.buildFromText(t.message ?: ""))
    }

    override fun populateEmptyResponseError(): Error {
        return Error(Error.GENERAL_ERROR_CODE, TextValue.buildFromCode(Error.EMPTY_RESPONSE_TEXT_CODE))
    }

}