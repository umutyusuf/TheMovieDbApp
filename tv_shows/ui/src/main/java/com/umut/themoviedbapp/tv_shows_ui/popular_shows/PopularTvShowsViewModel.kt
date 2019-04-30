package com.umut.themoviedbapp.tv_shows_ui.popular_shows

import android.content.Context
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.umut.domain.util.moveSubscribeToBackground
import com.umut.themovieapp.common.model.DataResource
import com.umut.themovieapp.common.model.Resource
import com.umut.themoviedbapp.tv_shows_ui.entity.SimpleTvShow
import com.umut.themoviedbapp.ui.extensions.getError
import com.umut.tv_shows_domain.GetPopularTvShowsUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class PopularTvShowsViewModel @Inject
constructor(
    private val getPopularTvShowsUseCase: GetPopularTvShowsUseCase,
    private val context: Context
) : ViewModel() {

    val popularTvShowsLiveData = MediatorLiveData<Resource<List<SimpleTvShow>>>()

    private val popularTvShows = ArrayList<SimpleTvShow>()
    private var currentPage = 1

    init {
        fetchPopularTvShows()
    }

    fun getNextPage() {
        currentPage++
        fetchPopularTvShows()
    }

    // region [Private Methods]
    private fun fetchPopularTvShows() {
        with(popularTvShowsLiveData) {
            value = DataResource.fetching(popularTvShows)
            getPopularTvShowsUseCase.getPopularTvShows(currentPage)
                .moveSubscribeToBackground(AndroidSchedulers.mainThread())
                .subscribeBy(
                    onError = { t ->
                        value = DataResource.error(null, t.getError(context))
                    },
                    onNext = { tvShowsPagedData ->
                        popularTvShows.addAll(tvShowsPagedData.results?.map { tvShow ->
                            SimpleTvShow(
                                tvShow.id,
                                tvShow.originalName ?: "",
                                tvShow.voteAverage ?: 0.0F,
                                tvShow.posterPath
                            )
                        } ?: Collections.emptyList())
                        value = DataResource.success(popularTvShows)
                    }
                )
        }
    }
    // endregion
}