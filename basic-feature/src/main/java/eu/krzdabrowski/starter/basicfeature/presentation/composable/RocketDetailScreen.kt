package eu.krzdabrowski.starter.basicfeature.presentation.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import eu.krzdabrowski.starter.core.design.Typography

@Composable
fun RocketDetailScreen(
    rocketName: String
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        TopAppBar(
            title = {
                Text(text = "Rocket Details", style = Typography.titleLarge)
            },
            navigationIcon = {
                Button(onClick = {  }) {
                    Text(text = "Back")
                }
            }
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Rocket Name: $rocketName",
                style = Typography.titleLarge
            )
        }
    }
}
