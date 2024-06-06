package eu.krzdabrowski.starter.basicfeature.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import eu.krzdabrowski.starter.basicfeature.presentation.composable.RocketDetailScreen
import eu.krzdabrowski.starter.basicfeature.presentation.composable.RocketsRoute
import eu.krzdabrowski.starter.core.navigation.NavigationDestination
import eu.krzdabrowski.starter.core.navigation.NavigationDestination.Rockets
import eu.krzdabrowski.starter.core.navigation.NavigationFactory
import eu.krzdabrowski.starter.core.navigation.NavigationManager
import javax.inject.Inject

class RocketsNavigationFactory @Inject constructor(
    private val navigationManager: NavigationManager
) : NavigationFactory {

    override fun create(builder: NavGraphBuilder) {
        builder.composable(Rockets.route) {
            RocketsRoute()
        }

        builder.composable(
            route = NavigationDestination.RocketDetail("{rocketName}").route,
            arguments = listOf(navArgument("rocketName") { nullable = false })
        ) { backStackEntry ->
            val rocketName = backStackEntry.arguments?.getString("rocketName") ?: return@composable
            RocketDetailScreen(rocketName = rocketName,navigationManager = navigationManager)
        }
    }
}