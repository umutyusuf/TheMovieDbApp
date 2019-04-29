package com.umut.themoviedbapp.tv_shows_ui.di

import com.umut.data.NetworkProvider
import com.umut.themoviedbapp.ShowsNetworkService
import com.umut.themoviedbapp.datasource.TvShowsDataSource
import com.umut.themoviedbapp.datasource.remote.TvShowsRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TvShowsDataModule {

    @Provides
    @Singleton
    fun provideNetworkSerice(networkProvider: NetworkProvider): ShowsNetworkService {
        return networkProvider.provideRetrofit().create(ShowsNetworkService::class.java)
    }

    @Provides
    @Singleton
    fun provideTvShowsDataSource(showsNetworkService: ShowsNetworkService): TvShowsDataSource =
        TvShowsRemoteDataSource(showsNetworkService)
}