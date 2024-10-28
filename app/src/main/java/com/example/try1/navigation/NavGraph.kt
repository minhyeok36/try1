package com.example.try1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("details/1") {
            SchoolHomeScreen()
        }
        composable("details/2") {
            ShuttleBusScreen()
        }
        composable("details/3") {
            NoticeScreen(navController)
        }
        // 추가로 다른 스크린도 같은 방식으로 구성할 수 있음
    }
}

