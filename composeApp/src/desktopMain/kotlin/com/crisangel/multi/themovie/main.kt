package com.crisangel.multi.themovie

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.crisangel.multi.themovie.ui.SplashApp

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TheMovie",
    ) {
        SplashApp()
    }
}