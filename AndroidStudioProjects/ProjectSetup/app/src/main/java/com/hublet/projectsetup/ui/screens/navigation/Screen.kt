package com.hublet.projectsetup.ui.screens.navigation

import com.hublet.projectsetup.utils.Constants.Companion.HOME_SCREEN
import com.hublet.projectsetup.utils.Constants.Companion.LOGIN_SCREEN
import com.hublet.projectsetup.utils.Constants.Companion.REGISTRATION_SCREEN

sealed class Screen(val route: String) {
    object HomeScreen : Screen(HOME_SCREEN)
    object LoginScreen : Screen(LOGIN_SCREEN)
    object RegistrationScreen : Screen(REGISTRATION_SCREEN)
}