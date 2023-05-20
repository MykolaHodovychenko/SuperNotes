package ua.digijed2.android.supernotes.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ua.digijed2.android.supernotes.ui.screens.MainScreen
import ua.digijed2.android.supernotes.ui.screens.NoteScreen

@Composable
fun NavSetup() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Main.route ) {
        composable(Screen.Main.route) { MainScreen(navController) }
        composable(Screen.Note.route) { NoteScreen(navController) }
    }

}