package com.umut.domain.message

interface MessageProvider {
    fun getMessageForCode(code: Int) : String?
    fun provideDefaultMessage(): String
}