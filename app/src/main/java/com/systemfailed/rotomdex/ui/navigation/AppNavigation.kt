package com.systemfailed.rotomdex.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.systemfailed.rotomdex.presentation.onboarding.OnBoardingScreen
import com.systemfailed.rotomdex.ui.splashscreen.SplashScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination =AppScreens.SplashScreen.route
    ){
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.OnBoardingScreen.route){
            OnBoardingScreen()
        }
    }
}
