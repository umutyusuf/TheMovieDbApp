plugins {
    id(Plugins.ANDROID_LIBRARY)
}
apply {
    from("$rootDir/android-common.gradle")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_DOMAIN))
    api(Support.RECYCLER_VIEW)
}