package com.example.materialcompass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialcompass.component.Timer
import com.example.materialcompass.ui.theme.MaterialCompassTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialCompassTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Timer(
                            totalTimer = 100L * 200L,
                            handleColor = MaterialTheme.colorScheme.background,
                            inactiveBarColor =MaterialTheme.colorScheme.primary ,
                            activeBarColor = MaterialTheme.colorScheme.onPrimary,
                            modifier = Modifier.size(350.dp)
                            )
                    }
                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialCompassTheme {
        Box(
            contentAlignment = Alignment.Center
        ){
            Timer(
                totalTimer = 100L * 2000L,
                handleColor = MaterialTheme.colorScheme.inverseOnSurface,
                inactiveBarColor =MaterialTheme.colorScheme.primary ,
                activeBarColor = MaterialTheme.colorScheme.onTertiary)
        }
    }
}