package eu.depau.etchdroid.ui.composables

import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowSizeClass


@Composable
fun ScreenSizeLayoutSelector(
    normal: @Composable () -> Unit,
    compact: @Composable () -> Unit,
    windowSizeClass: WindowSizeClass = currentWindowAdaptiveInfo().windowSizeClass
) {
    println("ScreenSizeLayoutSelector: ${windowSizeClass.windowHeightSizeClass}")
    if (windowSizeClass.windowHeightSizeClass == WindowHeightSizeClass.COMPACT) {
        compact()
    } else {
        normal()
    }
}
