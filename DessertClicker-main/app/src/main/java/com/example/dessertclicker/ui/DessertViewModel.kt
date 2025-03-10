package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.DessertUiState
import com.example.dessertclicker.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DessertViewModel : ViewModel() {

    private val _dessertUiState = MutableStateFlow(DessertUiState())
    val dessertUiState: StateFlow<DessertUiState> = _dessertUiState.asStateFlow()

    // Define fixed desserts for left and right positions
    // You can change these drawable resources and prices as needed
    private val leftDessertImageId = R.drawable.cupcake
    private val leftDessertPrice = 5
    private val rightDessertImageId = R.drawable.donut
    private val rightDessertPrice = 10

    init {
        // Initialize the UI state with our dessert information
        _dessertUiState.update { currentState ->
            currentState.copy(
                leftDessertImageId = leftDessertImageId,
                leftDessertPrice = leftDessertPrice,
                rightDessertImageId = rightDessertImageId,
                rightDessertPrice = rightDessertPrice
            )
        }
    }

    // Handle clicks on the left dessert
    fun onLeftDessertClicked() {
        _dessertUiState.update { currentState ->
            currentState.copy(
                revenue = currentState.revenue + currentState.leftDessertPrice,
                dessertsSold = currentState.dessertsSold + 1
            )
        }
    }

    // Handle clicks on the right dessert
    fun onRightDessertClicked() {
        _dessertUiState.update { currentState ->
            currentState.copy(
                revenue = currentState.revenue + currentState.rightDessertPrice,
                dessertsSold = currentState.dessertsSold + 1
            )
        }
    }
}