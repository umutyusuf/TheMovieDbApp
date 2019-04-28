package com.umut.data.util

import java.util.concurrent.TimeUnit

object Constants {
    // region connection constants
    const val CONNECTION_TIMEOUT = 15L
    val CONNECTION_TIMEOUT_UNIT = TimeUnit.SECONDS
    // endregion

    // region request header constants
    const val CONTENT_TYPE_HEADER = "Content-Type"
    const val Accept_HEADER = "Accept"
    const val MEDIA_TYPE_VALUE = "application/json"
    // endregion

    // region status codes
    const val STATUS_SUCCESS = 200
    // endregion

    //  region request params
    const val QUERY_PARAM_API_KEY = "api_key"
    const val QUERY_PARAM_LOCALE = "language"
    //  endregion

}