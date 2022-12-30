package org.ferdyhaspin.jalarcom.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.ferdyhaspin.jalarcom.ui.component.TopBarHome
import org.ferdyhaspin.jalarcom.ui.component.TopBarScreen
import org.ferdyhaspin.jalarcom.ui.navigation.Screen
import org.ferdyhaspin.jalarcom.ui.screen.feed.FeedScreen
import org.ferdyhaspin.jalarcom.ui.screen.home.HomeScreen
import org.ferdyhaspin.jalarcom.ui.screen.profile.ProfileScreen

/**
 * Created by ferdyhaspin on 30/12/22.
 */


@Composable
fun JalarComApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    var greetings by remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier,
        topBar = {
            when (currentRoute) {
                Screen.Home.route -> TopBarHome(
                    navigateToProfile = {
                        navController.navigate(Screen.Profile.route)
                    },
                    greetings = greetings
                )
                Screen.Profile.route -> TopBarScreen("Profil", navController)
                else -> TopBarScreen("Postingan", navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToFeed = {
                        navController.navigate(Screen.Feed.createRoute(it))
                    },
                    greetings = {
                        greetings = it
                    }
                )
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
            composable(
                route = Screen.Feed.route,
                arguments = listOf(navArgument("feedId") { type = NavType.IntType })
            ) {
                val id = it.arguments?.getInt("feedId") ?: -1
                FeedScreen(id, navController)
            }
        }
    }

}
