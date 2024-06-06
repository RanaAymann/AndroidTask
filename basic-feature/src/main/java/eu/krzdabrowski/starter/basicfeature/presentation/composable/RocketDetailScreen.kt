package eu.krzdabrowski.starter.basicfeature.presentation.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import eu.krzdabrowski.starter.basicfeature.R
import eu.krzdabrowski.starter.core.design.Typography
import eu.krzdabrowski.starter.core.navigation.NavigationManager

@Composable
fun RocketDetailScreen(
    rocketName: String,
    modifier: Modifier = Modifier,
    navigationManager: NavigationManager
) {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = R.string.rocketDetails)) },
        navigationIcon = {
            IconButton(onClick = { navigationManager.navigateBack() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
            }
        }
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(id = R.string.rocketName) + ": $rocketName",
                style = Typography.titleLarge
            )
        }
    }
}
