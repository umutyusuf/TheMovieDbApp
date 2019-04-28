package com.umut.data.model

import com.google.gson.annotations.SerializedName

data class PagedResponse<T>(
    @field:SerializedName("page") val page: Int?,
    @field:SerializedName("total_results") val totalResults: Int?,
    @field:SerializedName("total_pages") val totalPages: Int?,
    @field:SerializedName("results") val results: List<T>?
) : ApiResponse<PagedData<T>>() {

    override fun getData(): PagedData<T> {
        return PagedData(page, totalResults, totalPages, results)
    }
}

data class PagedData<T>(
    val page: Int?,
    val totalResults: Int?,
    val totalPages: Int?,
    val results: List<T>?
)