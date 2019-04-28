package com.umut.themoviedbapp.tv_shows_ui.popular_shows

import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.tv_shows_ui.databinding.FragmentPopularTvShowsBinding
import com.umut.themoviedbapp.ui.base.BaseFragment

class PopularTvShowsFragment : BaseFragment<PopularTvShowsViewModel, FragmentPopularTvShowsBinding>(
    R.layout.fragment_popular_tv_shows,
    PopularTvShowsViewModel::class.java
) {

}