package com.example.gameb

import com.example.gameb.model.Game


sealed class ScreenState {
    data class DataLoaded(val game: List<Game> ) : ScreenState()
    object Loading : ScreenState()
    data class Error(val error: String) : ScreenState()
}
