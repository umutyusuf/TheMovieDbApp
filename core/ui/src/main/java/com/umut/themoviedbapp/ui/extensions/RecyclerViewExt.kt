package com.umut.themoviedbapp.ui.extensions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <T : ViewDataBinding> ViewGroup.inflateBinding(@LayoutRes resId: Int, attachParent: Boolean = false) =
    DataBindingUtil.inflate<T>(LayoutInflater.from(context), resId, this, attachParent)