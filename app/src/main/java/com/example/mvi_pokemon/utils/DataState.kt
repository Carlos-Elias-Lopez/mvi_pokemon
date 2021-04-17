package com.example.mvi_pokemon.utils

import com.example.mvi_pokemon.model.Pokemon
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val pokemons: List<Pokemon>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()
}