plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(Modules.CORE_DATA))

    testImplementation(Testing.JUNIT)
    testImplementation(Testing.TEST_RUNNER)
    testImplementation(Networking.RETROFIT_GSON_CONVERTER) // FIXME: replace with gson, also check for a json test lib
}