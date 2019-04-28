plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.COMPILE_SDK)

    defaultConfig {
        applicationId = Configurations.APPLICATION_ID
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = Configurations.VERSION_CODE
        versionName = Configurations.VERSION_NAME
        testInstrumentationRunner = Configurations.INSTRUMENTATION_RUNNER_NAME
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        getByName("debug") {
            isMinifyEnabled = false
        }
    }

}

dependencies {
    implementation(CommonLibraries.KOTLIN_STD_LIB)
    implementation(Support.APP_COMPAT)

    testImplementation(Testing.JUNIT)

    androidTestImplementation(Testing.ESPRESSO_CORE)
    androidTestImplementation(Testing.TEST_RUNNER)
    androidTestImplementation(Testing.TEST_RULES)
}
