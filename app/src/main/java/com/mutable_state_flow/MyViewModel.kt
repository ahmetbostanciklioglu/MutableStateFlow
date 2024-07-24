package com.mutable_state_flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {
    private val _state = MutableStateFlow("Initial Value")
    val state: StateFlow<String> = _state.asStateFlow()

    fun updateState(newState: String) {
      viewModelScope.launch {
          _state.value = newState
      }
    }

}