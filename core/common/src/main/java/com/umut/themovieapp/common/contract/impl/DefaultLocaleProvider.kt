package com.umut.themovieapp.common.contract.impl

import com.umut.themovieapp.common.contract.LocaleProvider
import java.util.*
import javax.inject.Inject

class DefaultLocaleProvider @Inject constructor() : LocaleProvider {
    override fun getLocale(): String {
        return Locale.getDefault().displayLanguage
    }

}