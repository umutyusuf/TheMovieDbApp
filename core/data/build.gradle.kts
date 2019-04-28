plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_COMMON))
    implementation(Networking.RETROFIT_GSON_CONVERTER)
    implementation(Networking.RETROFIT)
    implementation(Networking.RETROFIT_RX_JAVA)
    implementation(Networking.OKHTTP_INTERCEPTOR)
    implementation(Networking.OKHTTP)
}