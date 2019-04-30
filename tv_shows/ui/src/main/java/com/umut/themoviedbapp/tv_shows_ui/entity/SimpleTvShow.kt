package com.umut.themoviedbapp.tv_shows_ui.entity

import com.umut.themoviedbapp.ui.recyclerview.ListItem

data class SimpleTvShow(
    val id: Long?,
    val showTitle: String,
    val average: Float,
    val posterPath: String?
) : ListItem<SimpleTvShow>() {

    override fun isSame(other: SimpleTvShow) = this.id == other.id

}