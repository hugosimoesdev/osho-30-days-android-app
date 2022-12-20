package com.example.osho30days.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.osho30days.R
import com.example.osho30days.model.Days
import com.example.osho30days.data.DaysRepository
import com.example.osho30days.ui.theme.Osho30daysTheme

/*
 * Composable that displays the top bar and the calendar grid
 */


@Composable
fun Osho30DaysApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Osho30DaysAppBar()
        }
        ) {
        DaysGrid()
    }
}

@Composable
fun Osho30DaysAppBar(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(56.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.app_name)
            // TODO: Add title text style
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DaysGrid() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(5),
    ) {
        items(DaysRepository.days) {
            DaysItem(days = it)
        }
    }
}

@Composable
fun DaysItem(
    days: Days,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .padding(8.dp)
        // TODO: Card clickable

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .sizeIn(minHeight = 62.dp)
        ) {
            Column() {
                Text(
                    text = stringResource(days.dayNumber)
                    // TODO: Add text style (fill the space blank)
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