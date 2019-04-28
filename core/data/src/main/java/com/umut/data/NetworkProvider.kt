package com.umut.data

import com.umut.data.interceptor.RequestInterceptor
import com.umut.data.interceptor.ResponseInterceptor
import com.umut.data.util.Constants
import com.umut.themovieapp.common.contract.LocaleProvider
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkProvider @Inject
constructor(
    private val baseUrl: String,
    private val apiKey: String,
    private val localeProvider: LocaleProvider,
    private val allowLogging: Boolean
) {

    private val retrofit = buildRetrofit(getOkHttpClient())

    fun provideRetrofit() = retrofit

    private fun buildRetrofit(okHttpClient: OkHttpClient): Retrofit =
        with(Retrofit.Builder()) {
            baseUrl(baseUrl)
            client(okHttpClient)
            addConverterFactory(GsonConverterFactory.create())
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            build()
        }

    private fun getOkHttpClient(): OkHttpClient =
        with(OkHttpClient.Builder()) {
            connectTimeout(Constants.CONNECTION_TIMEOUT, Constants.CONNECTION_TIMEOUT_UNIT)
            if (allowLogging) {
                addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
            }
            addInterceptor(RequestInterceptor(apiKey, localeProvider))
            addInterceptor(ResponseInterceptor())
            build()
        }
}
