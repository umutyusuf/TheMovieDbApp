plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(Modules.CORE_DOMAIN))
    api(project(Modules.TV_SHOWS_DATA))

    testImplementation(Testing.JUNIT)
    testImplementation(Testing.MOCKITO_CORE)
}