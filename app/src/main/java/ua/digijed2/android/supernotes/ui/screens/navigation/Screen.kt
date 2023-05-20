package ua.digijed2.android.supernotes.ui.screens.navigation

sealed class Screen(val route: String) {
    object Main: Screen("main")
    object Note: Screen("note")
}