package com.umut.themovieapp.common.contract

/**
 * Interface to provide the ability to change locale dynamically
 */
interface LocaleProvider {
    fun getLocale() : String
}