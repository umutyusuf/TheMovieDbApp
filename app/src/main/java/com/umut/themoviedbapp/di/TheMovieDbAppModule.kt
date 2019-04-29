package com.umut.themoviedbapp.di

import com.umut.themovieapp.common.error.CommonErrorFactory
import com.umut.themovieapp.common.error.ErrorFactory
import com.umut.themoviedbapp.tv_shows_ui.di.TvShowsModule
import dagger.Binds
import dagger.Module

@Module(includes = [TvShowsModule::class])
abstract class TheMovieDbAppModule {

    @Binds
    abstract fun bindErrorFactory(errorFactory: CommonErrorFactory) : ErrorFactory

}