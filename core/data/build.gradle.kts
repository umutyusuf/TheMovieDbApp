plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_COMMON))

    api(Networking.RETROFIT_GSON_CONVERTER)
    api(Networking.RETROFIT)
    api(Networking.RETROFIT_RX_JAVA)
    api(Networking.OKHTTP_INTERCEPTOR)
    api(Networking.OKHTTP)
}