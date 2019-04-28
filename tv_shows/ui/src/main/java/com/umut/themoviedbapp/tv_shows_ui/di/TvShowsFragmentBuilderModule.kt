package com.umut.themoviedbapp.tv_shows_ui.di

import com.umut.themovieapp.common.scope.ViewScope
import com.umut.themoviedbapp.tv_shows_ui.popular_shows.PopularTvShowsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class TvShowsFragmentBuilderModule {
    @ViewScope
    @ContributesAndroidInjector
    abstract fun contributePopularTvShowsFragment(): PopularTvShowsFragment
}