package com.umut.themoviedbapp.tv_shows_ui.di

import com.umut.themovieapp.common.scope.ContainerScope
import com.umut.themoviedbapp.tv_shows_ui.popular_shows.PopularTvShowsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class TvShowsActivityModule {
    @ContributesAndroidInjector(modules = [(TvShowsFragmentBuilderModule::class)])
    @ContainerScope
    abstract fun contributePopularTvShowsActivity(): PopularTvShowsActivity
}