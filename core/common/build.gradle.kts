plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    api(CommonLibraries.KOTLIN_STD_LIB)
    api(CommonLibraries.JAVAX_INJECT)

}