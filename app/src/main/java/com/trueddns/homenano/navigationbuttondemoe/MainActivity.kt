package com.trueddns.homenano.navigationbuttondemoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.navigation.compose.rememberNavController
import com.trueddns.homenano.navigationbuttondemoe.navigation.BottomNavItem
import com.trueddns.homenano.navigationbuttondemoe.navigation.BottomNavigationBar
import com.trueddns.homenano.navigationbuttondemoe.navigation.Navigation

class MainActivity : ComponentActivity() {
    
    val items = listOf<BottomNavItem>(
        
        BottomNavItem(
            "Home",
            "home",
            Icons.Default.Home
        ),
        
        BottomNavItem(
            "Chat",
            "chat",
            Icons.Default.Notifications,
            badgeCount = 25
        ),
        
        BottomNavItem(
            "Settings",
            "settings",
            Icons.Default.Settings
        )
        
    )
    
    
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                    BottomNavigationBar(
                        items = items, 
                        navController = navController,
                        onItemClick = {
                            navController.navigate(it.route)
                        } 
                    )
                }
            ) {
                Navigation(navController = navController)
            }
            
        }
    }
}
