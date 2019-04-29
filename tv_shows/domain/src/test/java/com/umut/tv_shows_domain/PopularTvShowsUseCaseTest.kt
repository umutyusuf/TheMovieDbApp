package com.umut.tv_shows_domain

import com.umut.data.model.PagedData
import com.umut.data.model.PagedResponse
import com.umut.themovieapp.common.error.CommonErrorFactory
import com.umut.themovieapp.common.error.CoreAppException
import com.umut.themoviedbapp.datasource.TvShowsDataSource
import com.umut.themoviedbapp.model.TvShow
import com.umut.tv_shows_domain.message.MessageCode
import com.umut.tv_shows_domain.message.MessageProvider
import io.reactivex.Single
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import java.util.*

class PopularTvShowsUseCaseTest {

    private lateinit var popularTvShowsUseCase: GetPopularTvShowsUseCase
    private lateinit var mockedDataSource: TvShowsDataSource

    @Before
    fun setup() {
        mockedDataSource = mock(TvShowsDataSource::class.java)

        val sampleMessageProvider = object : MessageProvider {
            override fun getMessageForCode(code: MessageCode) = "DEFAULT_MESSAGE"

        }
        popularTvShowsUseCase =
            GetPopularTvShowsUseCaseImpl(mockedDataSource, sampleMessageProvider, CommonErrorFactory())
    }

    @Test
    fun testFetchPopularTvShowsSuccess() {
        val response = PagedResponse(1, 100, 10, Collections.emptyList<TvShow>())
        `when`(mockedDataSource.getPopularTvShows(anyInt()))
            .thenReturn(Single.just(response))

        val testObserver = TestObserver<PagedData<TvShow>>()
        popularTvShowsUseCase.getPopularTvShows(1)
            .subscribe(testObserver)

        testObserver.awaitTerminalEvent()
        testObserver
            .assertSubscribed()
            .assertNoErrors()
            .assertValue(response.getData())
    }

    @Test
    fun testFetchPopularTvShowsMaxPageExceeded() {
        popularTvShowsUseCase.getPopularTvShows(MAX_PAGE_COUNT + 1)
            .test()
            .assertSubscribed()
            .assertFailure(CoreAppException::class.java)
    }
}