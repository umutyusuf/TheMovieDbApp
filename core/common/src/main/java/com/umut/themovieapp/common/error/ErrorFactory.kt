package com.umut.themovieapp.common.error

/**
 * Error creation contract
 * Basic implementation should create valid {@param Error}.
 *
 * Consider to implement one that might create analytics for errors as well.
 */
interface ErrorFactory {

    fun populateError(errorMessage: String) : Error

    fun populateError(errorCode: Int?, errorMessage: String) : Error

    fun populateError(t: Throwable) : Error

    fun populateEmptyResponseError(): Error

}