package com.umut.themoviedbapp.ui.recyclerview

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class CommonViewHolder<T : ViewDataBinding, E : ListItem<E>>(binding: T) :
    RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(data: E)
}