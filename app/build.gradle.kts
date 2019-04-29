plugins {
    id(Plugins.ANDROID_APPLICATION)
}
apply {
    from("$rootDir/android-common.gradle")
}

dependencies {
    implementation(project(Modules.TV_SHOWS_UI))

    testImplementation(Testing.JUNIT)

    androidTestImplementation(Testing.ESPRESSO_CORE)
    androidTestImplementation(Testing.ESPRESSO_INTENTS)
    androidTestImplementation(Testing.TEST_RUNNER)
    androidTestImplementation(Testing.TEST_RULES)
}