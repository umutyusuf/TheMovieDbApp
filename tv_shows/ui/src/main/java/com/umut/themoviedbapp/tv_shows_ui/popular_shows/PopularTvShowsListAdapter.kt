package com.umut.themoviedbapp.tv_shows_ui.popular_shows

import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.tv_shows_ui.databinding.ItemPopularTvShowBinding
import com.umut.themoviedbapp.tv_shows_ui.entity.SimpleTvShow
import com.umut.themoviedbapp.ui.recyclerview.CommonListAdapter
import com.umut.themoviedbapp.ui.recyclerview.CommonViewHolder

class PopularTvShowsListAdapter :
    CommonListAdapter<SimpleTvShow, ItemPopularTvShowBinding, PopularTvShowViewHolder>
        (R.layout.item_popular_tv_show) {

    override fun buildViewHolder(binding: ItemPopularTvShowBinding) = PopularTvShowViewHolder(binding)

}

class PopularTvShowViewHolder(private val binding: ItemPopularTvShowBinding) :
    CommonViewHolder<ItemPopularTvShowBinding, SimpleTvShow>(binding) {

    override fun bind(data: SimpleTvShow) {
        binding.tvShow = data
    }
}


