// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    // for dependency injection but not apply globally (apply false)
    id("com.google.dagger.hilt.android") version "2.57.2" apply false

    // symbol processing plugin. apply at root. required to run annotation processor (e.g. Room, Moshi, Hilt codegen)
    id("com.google.devtools.ksp") version "2.2.20-2.0.3" apply false
}