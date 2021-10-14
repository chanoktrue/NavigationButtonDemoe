package com.trueddns.homenano.navigationbuttondemoe.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.trueddns.homenano.navigationbuttondemoe.screen.ChatScreen
import com.trueddns.homenano.navigationbuttondemoe.screen.HomeScreen
import com.trueddns.homenano.navigationbuttondemoe.screen.SettingsScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "home",
    ){

        composable("home") {
            HomeScreen()
        }

        composable("chat") {
            ChatScreen()
        }

        composable("settings") {
            SettingsScreen()
        }
    }

}