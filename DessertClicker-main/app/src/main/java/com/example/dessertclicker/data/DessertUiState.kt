package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import com.example.dessertclicker.R
import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState(
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    // Left dessert properties
    @DrawableRes val leftDessertImageId: Int = R.drawable.cupcake,
    val leftDessertPrice: Int = 5,
    // Right dessert properties
    @DrawableRes val rightDessertImageId: Int = R.drawable.donut,
    val rightDessertPrice: Int = 10
)