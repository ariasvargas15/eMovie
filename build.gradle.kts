buildscript {
    dependencies {
        classpath(ClassPaths.HiltGradle)
    }
}

plugins {
    id (Plugins.AndroidApplication) version Versions.AndroidGradle apply false
    id (Plugins.AndroidLibrary) version Versions.AndroidGradle apply false
    id (Plugins.AndroidKotlin) version Versions.Kotlin apply false
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}