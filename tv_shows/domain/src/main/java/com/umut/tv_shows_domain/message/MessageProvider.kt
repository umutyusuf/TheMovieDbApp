package com.umut.tv_shows_domain.message

interface MessageProvider {
    fun getMessageForCode(code: MessageCode) : String
}