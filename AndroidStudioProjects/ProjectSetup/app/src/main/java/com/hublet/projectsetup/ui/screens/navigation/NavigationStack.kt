package com.hublet.projectsetup.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hublet.projectsetup.ui.screens.HomeScreen
import com.hublet.projectsetup.ui.screens.LoginScreen
import com.hublet.projectsetup.ui.screens.RegistrationScreen
import com.hublet.projectsetup.utils.Constants.Companion.HOME_SCREEN
import com.hublet.projectsetup.utils.Constants.Companion.LOGIN_SCREEN
import com.hublet.projectsetup.utils.Constants.Companion.REGISTRATION_SCREEN

@Composable
fun NavigationStack() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(route = Screen.HomeScreen.route){
            HomeScreen(
                onLoginClicked = { navController.navigate(LOGIN_SCREEN) },
                onRegisterClicked = { navController.navigate(REGISTRATION_SCREEN) }
            )
        }
        composable(route = Screen.LoginScreen.route){
            LoginScreen(
                onBackPressed = {navController.popBackStack()}
            )
        }
        composable(route = Screen.RegistrationScreen.route){
            RegistrationScreen(
                onBackPressed = {navController.popBackStack()}
            )
        }
    }
}