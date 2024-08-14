package com.crisangel.multi.themovie.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import cafe.adriel.voyager.core.screen.Screen

class MainScreen:Screen {
    @Composable
    override fun Content() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)) {
            Text(text = "Holi", textAlign = TextAlign.Center, color = Color.White)
            
        }
    }
}