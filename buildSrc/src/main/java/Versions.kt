import org.gradle.api.JavaVersion

object Versions {
    const val AndroidGradle = "7.2.1"
    const val Kotlin = "1.6.10"
    const val Hilt = "2.43.2"
    const val Navigation = "2.5.1"
}

object Libs {
    val Splash by lazy { "androidx.core:core-splashscreen:1.0.0" }
    val AppCompat by lazy { "androidx.appcompat:appcompat:1.5.0" }
    val Material by lazy { "com.google.android.material:material:1.6.1" }
    val SwipeRefresh by lazy { "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0" }

    object Navigation {
        val Fragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.Navigation}" }
        val Ui by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.Navigation}" }
    }

    object Hilt {
        val Android by lazy { "com.google.dagger:hilt-android:${Versions.Hilt}" }
        val Compiler by lazy { "com.google.dagger:hilt-compiler:${Versions.Hilt}" }
    }
}

object Plugins {
    val Android by lazy { "android" }
    val Kapt by lazy { "kapt" }
    val AndroidApplication by lazy { "com.android.application" }
    val AndroidLibrary by lazy { "com.android.library" }
    val AndroidKotlin by lazy { "org.jetbrains.kotlin.android" }
    val Hilt by lazy { "dagger.hilt.android.plugin" }
}

object ClassPaths {
    val HiltGradle by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.Hilt}" }
}

object AndroidConfig {
    const val CompileSdk = 32
    const val MinSdk = 24
    const val TargetSdk = 32
    const val VersionCode = 1
    const val VersionName = "1.0.0"
    const val ApplicationId = "com.bsav.emovie"
    val Java_1_8 = JavaVersion.VERSION_1_8
    const val JvmTarget = "1.8"
    const val TestInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}