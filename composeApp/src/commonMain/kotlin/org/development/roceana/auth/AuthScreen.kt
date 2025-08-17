package org.development.roceana.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import roceana.composeapp.generated.resources.Res
import roceana.composeapp.generated.resources.img_welcome

@Composable
fun AuthScreen() {
    Scaffold {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(it).fillMaxSize()
        ) {
            Image(
                painter = painterResource(resource = Res.drawable.img_welcome),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )
        }
    }
}

@Preview
@Composable
fun AuthScreenPreview() {
    AuthScreen()
}