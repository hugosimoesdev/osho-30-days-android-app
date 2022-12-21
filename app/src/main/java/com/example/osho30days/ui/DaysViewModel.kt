package com.example.osho30days.ui

import androidx.lifecycle.ViewModel
import com.example.osho30days.model.DaysUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


/*
 * Armazena o estado da UI
 */

class DaysViewModel: ViewModel() {

    // StateFlow
    private val _uiState = MutableStateFlow(DaysUiState())
    val uiState: StateFlow<DaysUiState> = _uiState.asStateFlow()
}