package ua.digijed2.android.supernotes.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import ua.digijed2.android.supernotes.ui.screens.navigation.NavSetup
import ua.digijed2.android.supernotes.ui.screens.viewmodels.SplashViewModel
import ua.digijed2.android.supernotes.ui.theme.SuperNotesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = SplashViewModel()

        installSplashScreen().setKeepOnScreenCondition { viewModel.isLoading.value }

        setContent {
            SuperNotesTheme {
                NavSetup()
            }
        }
    }
}