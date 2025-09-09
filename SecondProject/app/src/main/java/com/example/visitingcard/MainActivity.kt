package com.example.visitingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.visitingcard.ui.theme.VisitingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VisitingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    VisitingCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun VisitingCard(modifier: Modifier = Modifier) {
    Text(
        Text(
            text = "John Doe",
            fontSize = "28.sp",
            fontWeight = "FontWeight.Bold",
            color = "#"
        )

        Text(
                text = "Software Developer",
                fontSize = "16.sp",
                fontWeight = "FontWeight.Medium",
                color = "Color.Gray"
    )

    Spacer(modifier = Modifier.height("24.dp"))
)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VisitingCardTheme {
        VisitingCard()
    }
}