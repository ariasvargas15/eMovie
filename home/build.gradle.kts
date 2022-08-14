plugins {
    id(Plugins.AndroidLibrary)
    id(Plugins.AndroidKotlin)
    kotlin(Plugins.Kapt)
    id(Plugins.Hilt)
}

android {
    compileSdk = AndroidConfig.CompileSdk
    defaultConfig {
        minSdk = AndroidConfig.MinSdk
        targetSdk = AndroidConfig.TargetSdk
        testInstrumentationRunner = AndroidConfig.TestInstrumentationRunner
    }
    compileOptions {
        sourceCompatibility = AndroidConfig.Java_1_8
        targetCompatibility = AndroidConfig.Java_1_8
    }
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = AndroidConfig.JvmTarget
    }
}

dependencies {
    implementation(Libs.Hilt.Android)
    kapt(Libs.Hilt.Compiler)
    implementation(Libs.Navigation.Fragment)
    implementation(Libs.Navigation.Ui)

    implementation(Libs.SwipeRefresh)
}