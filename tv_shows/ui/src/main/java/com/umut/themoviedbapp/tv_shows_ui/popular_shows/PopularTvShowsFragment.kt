package com.umut.themoviedbapp.tv_shows_ui.popular_shows

import android.os.Bundle
import androidx.lifecycle.Observer
import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.tv_shows_ui.databinding.FragmentPopularTvShowsBinding
import com.umut.themoviedbapp.ui.base.BaseFragment

class PopularTvShowsFragment : BaseFragment<PopularTvShowsViewModel, FragmentPopularTvShowsBinding>(
    R.layout.fragment_popular_tv_shows,
    PopularTvShowsViewModel::class.java
) {

    companion object {
        fun newInstance() = PopularTvShowsFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.popularTvShowsLiveData.observe(viewLifecycleOwner, Observer {

        })
    }

}