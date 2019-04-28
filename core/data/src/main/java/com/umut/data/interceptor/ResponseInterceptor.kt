package com.umut.data.interceptor

import com.google.gson.Gson
import com.umut.data.model.ErrorResponse
import com.umut.data.model.HttpError
import com.umut.data.util.Constants
import okhttp3.Interceptor
import okhttp3.MediaType
import okhttp3.Response
import okhttp3.ResponseBody


class ResponseInterceptor : Interceptor {

    private val gson = Gson()

    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if (!response.isSuccessful) {
            val responseBody = response.body()
            val convertedHttpResponse = responseBody?.let { body ->
                val httpError = gson.fromJson(body.string(), HttpError::class.java)
                val errorCode = response.code()
                val convertedApiResponse = gson.toJson(ErrorResponse(errorCode, httpError.message))
                Response.Builder()
                    .body(ResponseBody.create(MediaType.parse(Constants.MEDIA_TYPE_VALUE), convertedApiResponse))
                    .code(Constants.STATUS_SUCCESS)
                    .headers(response.headers())
                    .build()

            }
            if (convertedHttpResponse != null) {
                return convertedHttpResponse
            }
        }
        return response
    }

}