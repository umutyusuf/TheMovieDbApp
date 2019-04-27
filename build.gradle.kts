// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath (ClasspathVariables.ANDROID_PLUGIN)
        classpath (ClasspathVariables.KOTLIN_PLUGIN)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class.java)
