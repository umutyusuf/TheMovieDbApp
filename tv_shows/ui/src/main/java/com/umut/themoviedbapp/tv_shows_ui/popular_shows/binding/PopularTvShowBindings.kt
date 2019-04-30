package com.umut.themoviedbapp.tv_shows_ui.popular_shows.binding

import android.text.TextUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.tv_shows_ui.entity.SimpleTvShow
import com.umut.themoviedbapp.ui.extensions.setResText

object PopularTvShowBindings {

    private const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500/"

    @JvmStatic
    @BindingAdapter("posterPath")
    fun bindPosterImage(imageView: ImageView, url: String?) {
        if (TextUtils.isEmpty(url)) {
            // TODO: set placeholder
            return
        }
        Picasso.get()
            .load(IMAGE_BASE_URL + url)
            .into(imageView)
    }

    @JvmStatic
    @BindingAdapter("subtitle")
    fun bindSubtitle(textView: TextView, simpleTvShow: SimpleTvShow?) {
        simpleTvShow?.let { tvShow ->
            textView.setResText(R.string.subtitle_template, simpleTvShow.showTitle, simpleTvShow.average)
        }
    }


}