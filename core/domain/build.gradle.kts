plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_DATA))

    testImplementation(Testing.JUNIT)
    testImplementation(Networking.RETROFIT_GSON_CONVERTER) // FIXME: replace with gson, also check for a json test lib
}