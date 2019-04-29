package com.umut.themoviedbapp.tv_shows_ui.message

import android.content.Context
import com.umut.themoviedbapp.tv_shows_ui.R
import com.umut.themoviedbapp.ui.message.DefaultMessageProvider
import com.umut.tv_shows_domain.message.MAX_PAGE_EXCEEDED
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TvShowsMessageProvider @Inject
constructor(private val context: Context) : DefaultMessageProvider(context) {
    override fun getMessageForCode(code: Int): String? {
        val defaultMessage = super.getMessageForCode(code)
        if (defaultMessage != null) {
            return defaultMessage
        }
        return when (code) {
            MAX_PAGE_EXCEEDED -> context.getString(R.string.all_shows_loaded)
            else -> null
        }
    }

    override fun provideDefaultMessage(): String {
        return context.getString(R.string.tv_shows_module_default_message)
    }

}