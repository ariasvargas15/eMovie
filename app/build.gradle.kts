plugins {
    id(Plugins.AndroidApplication)
    kotlin(Plugins.Android)
    kotlin(Plugins.Kapt)
    id(Plugins.Hilt)
}

android {
    compileSdk = AndroidConfig.CompileSdk
    defaultConfig {
        applicationId = AndroidConfig.ApplicationId
        minSdk = AndroidConfig.MinSdk
        targetSdk = AndroidConfig.TargetSdk
        versionCode = AndroidConfig.VersionCode
        versionName = AndroidConfig.VersionName
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
    implementation(project(":home"))
    implementation(project(":core"))

    implementation(Libs.Splash)
    implementation(Libs.AppCompat)
    implementation(Libs.Material)
    implementation(Libs.Hilt.Android)
    kapt(Libs.Hilt.Compiler)
    implementation(Libs.Navigation.Fragment)
    implementation(Libs.Navigation.Ui)
}