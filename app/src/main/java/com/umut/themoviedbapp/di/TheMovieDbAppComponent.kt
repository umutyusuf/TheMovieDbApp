package com.umut.themoviedbapp.di

import android.content.Context
import com.umut.data.NetworkProvider
import com.umut.themoviedbapp.TheMovieDbApp
import com.umut.themoviedbapp.tv_shows_ui.di.TvShowsModule
import com.umut.themoviedbapp.ui.viewmodel.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, TheMovieDbAppModule::class, ViewModelModule::class])
interface TheMovieDbAppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun withContext(applicationContext: Context): Builder

        @BindsInstance
        fun withNetworkProvider(networkProvider: NetworkProvider): Builder

        fun build(): TheMovieDbAppComponent
    }

    fun inject(theMovieDbApp: TheMovieDbApp)
}