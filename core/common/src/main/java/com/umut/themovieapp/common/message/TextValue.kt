package com.umut.themovieapp.common.message

class TextValue private constructor(
    private val isResource: Boolean,
    private val textCode: Int? = null,
    private val textResource: Int? = null,
    private val modifiers: Array<Any?>? = null,
    private val text: String? = null
) {

    companion object {
        fun buildFromCode(textCode: Int) =
            TextValue(isResource = false, textCode = textCode)

        fun buildFromResource(textResource: Int, modifiers: Array<Any?>? = null) =
            TextValue(isResource = false, textResource = textResource, modifiers = modifiers)

        fun buildFromText(text: String) =
            TextValue(isResource = false, text = text)
    }
}