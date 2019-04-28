package com.umut.themoviedbapp.datasource

import com.umut.data.model.PagedResponse
import com.umut.themoviedbapp.model.TvShow
import io.reactivex.Single

interface TvShowsDataSource  {
    fun getPopularTvShows(page: Int) : Single<PagedResponse<TvShow>>
}