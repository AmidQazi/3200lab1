package com.example.lab1_6feb2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1_6feb2024.ui.theme.Lab1_6Feb2024Theme
import android.util.Log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1_6Feb2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Haris")
                }
            }
        }
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "App = Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "App = Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "App = Stopped")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1_6Feb2024Theme {
        Greeting("Android")
    }
}