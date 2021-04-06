package com.example.mvi_pokemon.intent

sealed class Intent {
    object GetPokemonEvent: Intent()
    object None: Intent()
}