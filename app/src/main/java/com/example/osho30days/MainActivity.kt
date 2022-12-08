package com.example.osho30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.osho30days.model.Days
import com.example.osho30days.model.DaysRepository.days
import com.example.osho30days.ui.theme.Osho30daysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Osho30daysTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Osho30DaysApp()
                }
            }
        }
    }
}


@Composable
fun Osho30DaysApp() {
    DaysGrid()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DaysGrid(){
    LazyVerticalGrid(
        cells = GridCells.Fixed(5),
    ) {
        items(days){
            DaysItem(days = it)
        }
    }
}

@Composable
fun DaysItem(
    days: Days,
    modifier: Modifier = Modifier
){
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .padding(8.dp)

    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .sizeIn(minHeight = 72.dp)
        ){
            Column() {
                Text(
                    text = stringResource(days.dayNumber)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Osho30daysTheme {
        Osho30DaysApp()
    }
}