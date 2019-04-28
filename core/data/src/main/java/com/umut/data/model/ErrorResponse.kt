package com.umut.data.model

/**
 * Error Response wrapper for convenience
 */
class ErrorResponse(statusCode: Int?, statusMessage: String?) : ApiResponse<Nothing>(statusCode, statusMessage) {

    override fun getData(): Nothing? = null

    override fun isSuccessful() = false

}