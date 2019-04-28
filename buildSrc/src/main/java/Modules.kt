object Modules {
    private const val CORE = ":core"
    private const val TV_SHOWS = ":tv_shows"

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
    const val TV_SHOWS_DATA = "$TV_SHOWS:data"
    const val TV_SHOWS_DOMAIN = "$TV_SHOWS:domain"
    const val TV_SHOWS_UI = "$TV_SHOWS:ui"

    // endregion
}