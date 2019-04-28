plugins {
    id(Plugins.ANDROID_LIBRARY)
}
apply {
    from("$rootDir/android-library.gradle")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_UI))
    api(project(Modules.TV_SHOWS_DOMAIN))
}