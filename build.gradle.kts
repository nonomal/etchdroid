plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false

    if (System.getProperty("etchdroid.isGPlayFlavor") == "true" || System.getenv("ETCHDROID_ENABLE_SENTRY") == "true") {
        alias(libs.plugins.google.gms.google.services) apply false
        alias(libs.plugins.google.firebase.crashlytics) apply false
    }
}
