package com.umut.themoviedbapp.datasource.remote

import com.umut.data.model.PagedResponse
import com.umut.themoviedbapp.ShowsNetworkService
import com.umut.themoviedbapp.datasource.TvShowsDataSource
import com.umut.themoviedbapp.model.TvShow
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TvShowsRemoteDataSource @Inject
constructor(private val showsNetworkService: ShowsNetworkService) : TvShowsDataSource {

    override fun getPopularTvShows(page: Int): Single<PagedResponse<TvShow>> {
        return showsNetworkService.getPopularTvShows(page)
    }

}