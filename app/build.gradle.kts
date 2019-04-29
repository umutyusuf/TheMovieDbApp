plugins {
    id(Plugins.ANDROID_APPLICATION)
}

apply {
    from("$rootDir/android-common.gradle")
}

android {
    buildTypes {
        getByName("release") {
            buildConfigField("String", "BASE_URL", "\"https://api.themoviedb.org/3/\"")
            buildConfigField("String", "API_KEY", "\"5d967c7c335764f39b1efbe9c5de9760\"")
        }

        getByName("debug") {
            buildConfigField("String", "BASE_URL", "\"https://api.themoviedb.org/3/\"")
            buildConfigField("String", "API_KEY", "\"5d967c7c335764f39b1efbe9c5de9760\"")
        }
    }
}

dependencies {
    implementation(project(Modules.TV_SHOWS_UI))

    testImplementation(Testing.JUNIT)

    androidTestImplementation(Testing.ESPRESSO_CORE)
    androidTestImplementation(Testing.ESPRESSO_INTENTS)
    androidTestImplementation(Testing.TEST_RUNNER)
    androidTestImplementation(Testing.TEST_RULES)
}