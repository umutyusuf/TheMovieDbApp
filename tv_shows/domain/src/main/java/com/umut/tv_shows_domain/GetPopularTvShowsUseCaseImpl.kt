package com.umut.tv_shows_domain

import com.umut.data.model.PagedData
import com.umut.domain.BaseUseCase
import com.umut.domain.util.moveSubscribeToBackground
import com.umut.themovieapp.common.error.CoreAppException
import com.umut.themovieapp.common.error.Error
import com.umut.themovieapp.common.error.ErrorFactory
import com.umut.themovieapp.common.message.TextValue
import com.umut.themoviedbapp.datasource.TvShowsDataSource
import com.umut.themoviedbapp.model.TvShow
import com.umut.tv_shows_domain.message.MessageCode
import com.umut.tv_shows_domain.message.MessageProvider
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


const val MAX_PAGE_COUNT = 1000

class GetPopularTvShowsUseCaseImpl @Inject
constructor(
    private val tvShowsDataSource: TvShowsDataSource,
    private val messageProvider: MessageProvider,
    errorFactory: ErrorFactory
) : BaseUseCase(errorFactory), GetPopularTvShowsUseCase {

    override fun getPopularTvShows(page: Int?): Observable<PagedData<TvShow>> {
        val validPage = page ?: 1
        // validate max page count exceeded
        if (validPage > MAX_PAGE_COUNT) {
            return Observable.error(
                CoreAppException(
                    Error(textValue = TextValue.buildFromText(messageProvider.getMessageForCode(MessageCode.MAX_PAGE_EXCEEDED)))
                )
            )
        }
        return tvShowsDataSource.getPopularTvShows(validPage)
            .toObservable()
            .moveSubscribeToBackground(Schedulers.io())
            .map {response ->
                processData(response)
            }
    }

}