
object Deps {
    object Common {
        const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN_PLUGIN}"
    }

    object Support {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.Support.APP_COMPAT}"
    }

    object Testing {
        const val JUNIT = "androidx.test.ext:junit:${Versions.Testing.JUNIT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.Testing.ESPRESSO_CORE}"
        const val TEST_RUNNER = "androidx.test:runner:${Versions.Testing.TEST_RUNNER}"
        const val TEST_RULES = "androidx.test:rules:${Versions.Testing.TEST_RULES}"
    }
}