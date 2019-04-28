package com.umut.domain

import com.umut.data.model.ApiResponse
import com.umut.themovieapp.common.error.CoreAppException
import com.umut.themovieapp.common.error.ErrorFactory

/**
 * Base usecase class that provides unified mechanism for extracting data and producing meaningful errors
 */
open class BaseUseCase(private val errorFactory: ErrorFactory) {

    companion object {
        const val EMPTY_ERROR_MESSAGE = "THE_MOVIE_DB_APP_ERROR"
    }

    /**
     * process data and throw related exceptions on error cases
     * @return data if the response is OK
     */
    fun <T> processData(response: ApiResponse<T>): T {

        if (!response.isSuccessful()) {
            val error = errorFactory.populateError(
                response.statusCode,
                response.statusMessage ?: EMPTY_ERROR_MESSAGE
            )
            throw CoreAppException(error)
        }
        if (response.getData() == null) {
            throw CoreAppException(errorFactory.populateEmptyResponseError())
        }
        return response.getData()!!
    }
}