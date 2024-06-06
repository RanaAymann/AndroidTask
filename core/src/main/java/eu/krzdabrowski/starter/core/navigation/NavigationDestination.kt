package eu.krzdabrowski.starter.core.navigation

sealed class NavigationDestination(
    val route: String,
) {
    data object Rockets : NavigationDestination("rocketsDestination")
    data object Back : NavigationDestination("navigationBack")
    data class RocketDetail(val rocketName: String) : NavigationDestination("rocket_detail/$rocketName")

}
