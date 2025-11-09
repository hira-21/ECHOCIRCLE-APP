// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Define plugin versions in the top-level file using placeholders.
    id("com.android.application") version "AGP_VERSION" apply false
    id("com.android.library") version "AGP_VERSION" apply false
    id("org.jetbrains.kotlin.android") version "KOTLIN_VERSION" apply false
}
repositories {
    google()
    mavenCentral()
}
