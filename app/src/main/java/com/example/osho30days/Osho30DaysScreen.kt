package com.example.osho30days.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.osho30days.model.Days
import com.example.osho30days.data.DaysRepository
import com.example.osho30days.ui.theme.Osho30daysTheme

/*
 * Composable that displays the topBar and the calendar grid
 */


@Composable
fun Osho30DaysApp() {
    DaysGrid()
}

@Composable
fun Osho30DaysAppBar() {

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