package com.umut.themoviedbapp.tv_shows_ui.popular_shows

import android.os.Bundle
import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.ui.base.BaseActivity
import com.umut.themoviedbapp.ui.extensions.transact

class PopularTvShowsActivity  : BaseActivity(R.layout.activity_popular_tv_shows){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.transact {
                replace(R.id.popularTvShowsContainer, PopularTvShowsFragment.newInstance())
            }
        }
    }

}