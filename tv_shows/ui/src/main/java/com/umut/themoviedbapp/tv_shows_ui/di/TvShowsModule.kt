package com.umut.themoviedbapp.tv_shows_ui.di

import com.umut.domain.message.MessageProvider
import com.umut.themoviedbapp.tv_shows_ui.message.TvShowsMessageProvider
import dagger.Binds
import dagger.Module

@Module(
    includes = [TvShowsActivityModule::class, TvShowsViewModelModule::class,
        TvShowsDomainModule::class, TvShowsDataModule::class]
)
abstract class TvShowsModule {

    @Binds
    abstract fun bindTvShowsMessageProvider(messageProvider: TvShowsMessageProvider): MessageProvider
}