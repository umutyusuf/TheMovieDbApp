object CommonLibraries {
    const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN_PLUGIN}"
    const val JAVAX_INJECT = "javax.inject:javax.inject:${Versions.Common.JAVAX_INJECT}"
}

object Support {
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.Support.ANDROID_X}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.Support.ANDROID_X}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.Support.LIFECYCLE_EXTENSIONS}"
}

object Testing {
    const val JUNIT = "androidx.test.ext:junit:${Versions.Testing.JUNIT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.Testing.ESPRESSO_CORE}"
    const val ESPRESSO_INTENTS = "com.android.support.test.espresso:espresso-intents:${Versions.Testing.ESPRESSO_INTENTS}"
    const val TEST_RUNNER = "androidx.test:runner:${Versions.Testing.TEST_RUNNER}"
    const val TEST_RULES = "androidx.test:rules:${Versions.Testing.TEST_RULES}"
    const val MOCKITO_ANDROID = "org.mockito:mockito-android:${Versions.Testing.MOCKITO}"
    const val MOCKITO_CORE = "org.mockito:mockito-core:${Versions.Testing.MOCKITO}"
    const val TEST_DATA_BINDING =  "androidx.databinding:databinding-compiler:${Versions.ANDROID_PLUGIN}"
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

object UI {
    const val PICASSO = "com.squareup.picasso:picasso:${Versions.UI.PICASSO}"
}
