package com.umut.themovieapp.common.model

import com.umut.themovieapp.common.error.Error

interface Resource<T> {

    fun getData() : T?

    fun getError() : Error?

    fun getState() : ResourceState

    fun hasError() : Boolean
}