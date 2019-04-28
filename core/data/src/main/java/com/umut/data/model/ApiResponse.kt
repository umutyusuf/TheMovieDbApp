package com.umut.data.model

import com.google.gson.annotations.SerializedName

abstract class ApiResponse<T>(
    @field:SerializedName("status_code") val statusCode: Int? = null,
    @field:SerializedName("status_message") val statusMessage: String? = null,
    @field:SerializedName("success") val success: Boolean = true
) {

    abstract fun getData(): T?

    open fun isSuccessful(): Boolean {
        return success || (statusCode == null || statusMessage?.isNotEmpty() != true)
    }

}