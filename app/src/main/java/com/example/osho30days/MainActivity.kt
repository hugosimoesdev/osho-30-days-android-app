package com.example.osho30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.osho30days.ui.theme.Osho30daysTheme


/*
 * Activity for 30 days Osho challenge
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Osho30daysTheme {
                Osho30DaysApp()
            }
        }
    }
}