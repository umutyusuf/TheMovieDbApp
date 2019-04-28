package com.umut.tv_shows_domain

import com.umut.data.model.PagedData
import com.umut.themoviedbapp.model.TvShow
import io.reactivex.Observable

interface GetPopularTvShowsUseCase {
    fun getPopularTvShows(page: Int?) : Observable<PagedData<TvShow>>
}