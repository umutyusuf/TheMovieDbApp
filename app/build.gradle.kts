plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.COMPILE_SDK)
    defaultConfig {
        applicationId = Configuration.APPLICATION_ID
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = Configuration.VERSION_CODE
        versionName = Configuration.VERSION_NAME
        testInstrumentationRunner = Configuration.INSTRUMENTATION_RUNNER_NAME
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    implementation(Deps.Common.KOTLIN_STD_LIB)
    implementation(Deps.Support.APP_COMPAT)

    testImplementation(Deps.Testing.JUNIT)

    androidTestImplementation(Deps.Testing.ESPRESSO_CORE)
    androidTestImplementation(Deps.Testing.TEST_RUNNER)
    androidTestImplementation(Deps.Testing.TEST_RULES)
}
