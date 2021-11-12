package com.example.navegacion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun Pantalla2(navController: NavController) {
    Scaffold() {


        Button(onClick = { navController.navigate("Pantalla1") }) {
            Text(text = "Go to pantalla1")

        }
    }
    
}