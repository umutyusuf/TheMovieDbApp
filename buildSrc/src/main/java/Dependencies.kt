object CommonLibraries {
    const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN_PLUGIN}"
    const val JAVAX_INJECT = "javax.inject:javax.inject:${Versions.Common.JAVAX_INJECT}"
}

object Support {
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.Support.APP_COMPAT}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.Support.LIFECYCLE_EXTENSIONS}"
}

object Testing {
    const val JUNIT = "androidx.test.ext:junit:${Versions.Testing.JUNIT}"
    const val TEST_CORE = "androidx.test:core:${Versions.Testing.TEST_RUNNER}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.Testing.ESPRESSO_CORE}"
    const val TEST_RUNNER = "androidx.test:runner:${Versions.Testing.TEST_RUNNER}"
    const val TEST_RULES = "androidx.test:rules:${Versions.Testing.TEST_RULES}"
}

object Networking {
    const val RETROFIT_GSON_CONVERTER =
        "com.squareup.retrofit2:converter-gson:${Versions.Networking.RETROFIT_GSON_CONVERTER}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Networking.RETROFIT}"
    const val RETROFIT_RX_JAVA = "com.squareup.retrofit2:adapter-rxjava2:${Versions.Networking.RETROFIT_RX_JAVA}"
    const val OKHTTP_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.Networking.OKHTTP_INTERCEPTOR}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.Networking.OKHTTP}"
}

object Dagger {
    const val DAGGER = "com.google.dagger:dagger-android-support:${Versions.Dagger.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.Dagger.DAGGER}"
    const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:${Versions.Dagger.DAGGER}"
}

object Rx {
    const val RX_KOTLIN = "io.reactivex.rxjava2:rxkotlin:${Versions.Rx.RX_KOTLIN}"
    const val RX_ANDROID = "io.reactivex.rxjava2:rxandroid:${Versions.Rx.RX_ANDROID}"
}

