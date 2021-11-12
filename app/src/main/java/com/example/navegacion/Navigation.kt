package com.example.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navHostController = rememberNavController()
    NavHost(
        navController = navHostController,
        startDestination = Screen.Pantalla1.route
    ) {
        composable(route=Screen.Pantalla1.route){
            Pantalla1(navController = navHostController)}
        composable(
            route=Screen.Pantalla2.route){
            Pantalla2(navController = navHostController)
        }
        
    }


}