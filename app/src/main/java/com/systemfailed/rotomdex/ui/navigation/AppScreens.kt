package com.systemfailed.rotomdex.ui.navigation

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object OnBoardingScreen: AppScreens("main_screen")
}
