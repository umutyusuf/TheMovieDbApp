package com.umut.themoviedbapp

import com.umut.data.model.PagedResponse
import com.umut.themoviedbapp.model.TvShow
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.GET

interface ShowsNetworkService {
    @GET("/tv/popular")
    fun getPopularTvShows(@Field("page") page: Int) : Single<PagedResponse<TvShow>>
}