package com.umut.themoviedbapp.tv_shows_ui.di

import com.umut.tv_shows_domain.GetPopularTvShowsUseCase
import com.umut.tv_shows_domain.GetPopularTvShowsUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class TvShowsDomainModule {

    @Binds
    abstract fun bindGetPopularTvShowsUseCase(getPopularTvShowsUseCase: GetPopularTvShowsUseCaseImpl): GetPopularTvShowsUseCase
}