package com.umut.themoviedbapp.ui.recyclerview

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.ListAdapter
import com.umut.themoviedbapp.ui.extensions.inflateBinding

abstract class CommonListAdapter<E : ListItem<E>, T : ViewDataBinding, B : CommonViewHolder<T, E>>(
    @LayoutRes private val layoutRes: Int
) :
    ListAdapter<E, B>(ListItem.ListItemDiffCallback<E>()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): B {
        val binding = parent.inflateBinding<T>(layoutRes)
        return buildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: B, position: Int) {
        holder.bind(getItem(position))
    }

    abstract fun buildViewHolder(binding: T): B

}