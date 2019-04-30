package com.umut.themoviedbapp.ui.recyclerview

import androidx.recyclerview.widget.DiffUtil

abstract class ListItem<I : ListItem<I>> {

    abstract fun isSame(other: I): Boolean

    class ListItemDiffCallback<T : ListItem<T>> : DiffUtil.ItemCallback<T>() {
        override fun areItemsTheSame(oldItem: T, newItem: T) = oldItem.isSame(newItem)


        override fun areContentsTheSame(oldItem: T, newItem: T) = oldItem.equals(newItem)

    }

}