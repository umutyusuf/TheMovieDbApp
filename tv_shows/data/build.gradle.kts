plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_DATA))
    api(Rx.RX_KOTLIN)
}