package com.umut.themoviedbapp.tv_shows_ui.di

import androidx.lifecycle.ViewModel
import com.umut.themoviedbapp.tv_shows_ui.popular_shows.PopularTvShowsViewModel
import com.umut.themoviedbapp.ui.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class TvShowsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PopularTvShowsViewModel::class)
    abstract fun bindPopularTvShowsViewModel(paymentViewModel: PopularTvShowsViewModel): ViewModel

}