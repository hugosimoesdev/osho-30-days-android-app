package com.example.osho30days.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.osho30days.R
import com.example.osho30days.ui.theme.Osho30daysTheme

@Composable
fun DaysDatailsScreen(){
    Column {
        Image(painter = painterResource(R.drawable.flor_llorona), contentDescription = "Flor")
        Column(){
            Text(text = "Title of the day")
            Text(text = "Mensage of the day")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Osho30daysTheme {
        DaysDatailsScreen()
    }
}
