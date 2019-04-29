plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_DATA))
}