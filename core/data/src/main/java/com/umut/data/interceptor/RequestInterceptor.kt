package com.umut.data.interceptor

import com.umut.data.util.Constants.Accept_HEADER
import com.umut.data.util.Constants.CONTENT_TYPE_HEADER
import com.umut.data.util.Constants.MEDIA_TYPE_VALUE
import com.umut.data.util.Constants.QUERY_PARAM_API_KEY
import com.umut.data.util.Constants.QUERY_PARAM_LOCALE
import com.umut.themovieapp.common.contract.LocaleProvider
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response


/**
 * Intercepts request and enriches with headers
 * and custom parameters
 */
class RequestInterceptor(
    private val apiKey: String,
    private val localeProvider: LocaleProvider
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(
        with(chain.request().newBuilder()) {
            url(enrichUrl(chain.request().url()))
            addHeader(CONTENT_TYPE_HEADER, MEDIA_TYPE_VALUE)
            addHeader(Accept_HEADER, MEDIA_TYPE_VALUE)
            build()
        }
    )

    private fun enrichUrl(url: HttpUrl): HttpUrl {
        return url.newBuilder()
            .addQueryParameter(QUERY_PARAM_API_KEY, apiKey)
            .addQueryParameter(QUERY_PARAM_LOCALE, localeProvider.getLocale())
            .build();
    }

}