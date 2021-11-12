package com.example.navegacion

sealed class Screen(val route:String){
    object Pantalla1:Screen("pantalla1")
    object Pantalla2:Screen("pantalla2")
}