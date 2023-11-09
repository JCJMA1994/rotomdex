package com.systemfailed.rotomdex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.systemfailed.rotomdex.ui.navigation.AppNavigation
import com.systemfailed.rotomdex.ui.splashscreen.Splash
import com.systemfailed.rotomdex.ui.theme.ComposeScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ComposeScreenTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }


        }
    }
}

@Composable
fun HomeScreen() {
    AppNavigation()
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Splash()
}
