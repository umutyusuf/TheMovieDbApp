object Modules {
    private const val CORE = ":core"
    private const val POPULAR_SHOWS = ":shows"

    /**
     * App
     */
    const val APP = ":app"

    // region core
    /**
     * Core
     */
    const val CORE_COMMON = "$CORE:common"
    const val CORE_DATA = "$CORE:data"
    const val CORE_DOMAIN = "$CORE:domain"
    const val CORE_UI = "$CORE:ui"
    // endregion

    // region popular shows
    /**
     * Popular Shows
     */
    const val POPULAR_SHOWS_DATA = "$POPULAR_SHOWS:data"
    const val POPULAR_SHOWS_DOMAIN = "$POPULAR_SHOWS:domain"
    const val POPULAR_SHOWS_UI = "$POPULAR_SHOWS:ui"

    // endregion
}