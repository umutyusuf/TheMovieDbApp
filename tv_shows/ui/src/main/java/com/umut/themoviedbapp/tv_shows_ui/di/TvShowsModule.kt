package com.umut.themoviedbapp.tv_shows_ui.di

import dagger.Module

@Module(includes = [TvShowsActivityModule::class, TvShowsViewModelModule::class])
abstract class TvShowsModule {

}