package org.ferdyhaspin.jalarcom.ui.navigation

/**
 * Created by ferdyhaspin on 30/12/22.
 */


sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Profile: Screen("profile")
    object Feed: Screen("feed/{feedId}"){
        fun createRoute(feedId: Int) = "feed/$feedId"
    }
}