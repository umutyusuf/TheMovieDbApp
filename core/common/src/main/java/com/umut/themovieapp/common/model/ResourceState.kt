package com.umut.themovieapp.common.model

// Using simple enums is not bad practise thus optimized proguard converts it to int anyway
enum class ResourceState {
    FETCHING,
    SUCCESS,
    ERROR
}