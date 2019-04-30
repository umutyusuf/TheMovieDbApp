package com.umut.themoviedbapp.ui.binding

import android.view.View
import androidx.databinding.BindingConversion
import com.umut.themovieapp.common.model.Resource
import com.umut.themovieapp.common.model.ResourceState

object BindingConversions {
    @JvmStatic
    @BindingConversion
    fun <T> bindBeanToProgress(bean: Resource<T>?): Int =
        if (bean?.getState() == ResourceState.FETCHING) View.VISIBLE else View.GONE

    @JvmStatic
    @BindingConversion
    fun bindBooleanToVisibility(isVisible: Boolean): Int = if (isVisible) View.VISIBLE else View.GONE
}