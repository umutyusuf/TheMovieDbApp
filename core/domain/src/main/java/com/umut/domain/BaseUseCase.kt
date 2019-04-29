package com.umut.domain

import com.umut.data.model.ApiResponse
import com.umut.domain.message.MessageProvider
import com.umut.themovieapp.common.error.CoreAppException
import com.umut.themovieapp.common.error.Error.Companion.EMPTY_RESPONSE_CODE
import com.umut.themovieapp.common.error.ErrorFactory

/**
 * Base usecase class that provides unified mechanism for extracting data and producing meaningful errors
 */
open class BaseUseCase(
    private val errorFactory: ErrorFactory,
    private val messageProvider: MessageProvider
) {

    /**
     * process data and throw related exceptions on error cases
     * @return data if the response is OK
     */
    fun <T> processData(response: ApiResponse<T>): T {

        if (!response.isSuccessful()) {
            val error = errorFactory.populateError(
                response.statusCode,
                response.statusMessage ?: messageProvider.provideDefaultMessage()
            )
            throw CoreAppException(error)
        }
        if (response.getData() == null) {
            val errorMessage = messageProvider.getMessageForCode(EMPTY_RESPONSE_CODE)
                ?: messageProvider.provideDefaultMessage()
            throw CoreAppException(errorFactory.populateError(errorMessage))
        }
        return response.getData()!!
    }
}