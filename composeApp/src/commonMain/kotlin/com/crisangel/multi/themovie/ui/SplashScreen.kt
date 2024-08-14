package com.crisangel.multi.themovie.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import com.crisangel.multi.themovie.ui.splash.MainScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import themovie.composeapp.generated.resources.Res
import themovie.composeapp.generated.resources.cinema

@Composable
fun SplashApp(){
    MaterialTheme {
        Navigator(SplashScreen())
    }
}


class SplashScreen: Screen {
    @Composable
    override fun Content() {
        ContentSplash()
    }

}

@Composable
fun ContentSplash() {
    val navigator = LocalNavigator.current
    val coroutine= rememberCoroutineScope()
    LaunchedEffect(key1 = true) {
        coroutine.launch {
            delay(3000)
            navigator?.push(MainScreen())
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(Res.drawable.cinema), contentDescription = null)

    }
}
