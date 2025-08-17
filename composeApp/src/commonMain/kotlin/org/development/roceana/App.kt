package org.development.roceana

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.development.roceana.auth.AuthScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        AuthScreen()
    }
}