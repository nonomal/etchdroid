package eu.depau.etchdroid

import eu.depau.etchdroid.plugins.telemetry.Telemetry

fun setUpMockTelemetry() {
    Telemetry.TESTS_ONLY_setTestMode(true)
}
