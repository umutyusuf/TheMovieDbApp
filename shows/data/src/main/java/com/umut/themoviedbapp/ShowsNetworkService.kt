package com.umut.themoviedbapp

import retrofit2.http.Field
import retrofit2.http.GET

interface ShowsNetworkService {
    @GET("/tv/popular")
    fun getPopularTvShows(@Field("page") page: Int)
}