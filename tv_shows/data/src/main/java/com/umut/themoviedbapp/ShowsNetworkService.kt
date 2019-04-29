package com.umut.themoviedbapp

import com.umut.data.model.PagedResponse
import com.umut.themoviedbapp.model.TvShow
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ShowsNetworkService {
    @GET("tv/popular")
    fun getPopularTvShows(@Query("page") page: Int) : Single<PagedResponse<TvShow>>
}