package com.example.osho30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Days(
    @StringRes val dayNumber: Int,
    // @DrawableRes val dayImg: Int,
    val dayMsg: String?
)
