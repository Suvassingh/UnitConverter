package com.example.learningjetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun navHostApp() {
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = routes.login){
        composable<routes.login>{
            loginui(navController)
        }
        composable<routes.details> {
            val data = it.toRoute<routes.details>()
            detailScreen(navController, name = data.name, email = data.email)
        }
    }
    
}