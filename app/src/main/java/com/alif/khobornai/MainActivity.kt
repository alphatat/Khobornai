package com.alif.khobornai

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
import com.alif.khobornai.ui.theme.KhobornaiTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.alif.khobornai.data.model.Newspaper
import com.alif.khobornai.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KhobornaiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Replace this with real scraped data later
                    val sampleNewspapers = listOf(
                        Newspaper("Prothom Alo", "2025-05-28", "https://placehold.co/600x400"),
                        Newspaper("Daily Star", "2025-05-28", "https://placehold.co/600x400")
                    )
                    HomeScreen(newspapers = sampleNewspapers)
                }
            }
        }
    }
}
