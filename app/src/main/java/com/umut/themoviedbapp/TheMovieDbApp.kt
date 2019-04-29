package com.umut.themoviedbapp

import android.app.Activity
import android.app.Application
import com.umut.data.NetworkProvider
import com.umut.themovieapp.common.contract.impl.DefaultLocaleProvider
import com.umut.themoviedbapp.di.DaggerTheMovieDbAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TheMovieDbApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        return DaggerTheMovieDbAppComponent
            .builder()
            .withContext(this)
            .withNetworkProvider(
                NetworkProvider(
                    BuildConfig.BASE_URL,
                    BuildConfig.API_KEY,
                    DefaultLocaleProvider(),
                    BuildConfig.DEBUG
                )
            ).build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}