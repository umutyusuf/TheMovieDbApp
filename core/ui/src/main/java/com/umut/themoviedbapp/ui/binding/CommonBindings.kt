package com.umut.themoviedbapp.ui.binding

import android.view.View
import androidx.databinding.BindingAdapter
import com.umut.themovieapp.common.model.Resource
import com.umut.themoviedbapp.ui.extensions.alertError

object CommonBindings {
    @JvmStatic
    @BindingAdapter("resourceState")
    fun bindResourceState(view: View, resource: Resource<*>?) {
        if (resource?.hasError() == true && resource.getError() != null) {
            view.context.alertError(resource.getError()!!)
        }
    }
}