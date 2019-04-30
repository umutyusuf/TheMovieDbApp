package com.umut.themoviedbapp.tv_shows_ui.popular_shows

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.umut.themovieapp.common.model.ResourceState
import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.tv_shows_ui.databinding.FragmentPopularTvShowsBinding
import com.umut.themoviedbapp.ui.base.BaseFragment
import com.umut.themoviedbapp.ui.recyclerview.RecyclerViewLoadMoreListener

class PopularTvShowsFragment : BaseFragment<PopularTvShowsViewModel, FragmentPopularTvShowsBinding>(
    R.layout.fragment_popular_tv_shows,
    PopularTvShowsViewModel::class.java
) {

    companion object {
        fun newInstance() = PopularTvShowsFragment()
    }

    private val loadMoreListener = object : RecyclerViewLoadMoreListener() {

        override fun loadMore() {
            viewModel.getNextPage()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.popularTvShowsRecyclerView.adapter = PopularTvShowsListAdapter()
        binding.popularTvShowsRecyclerView.addOnScrollListener(loadMoreListener)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.popularTvShowsLiveData.observe(viewLifecycleOwner, Observer { resource ->
            binding.resource = resource
            if (resource.getState() == ResourceState.SUCCESS) {
                (binding.popularTvShowsRecyclerView.adapter as PopularTvShowsListAdapter).submitList(resource.getData())
                loadMoreListener.loadCompleted(resource.getData()?.size)
            }
        })
    }

}