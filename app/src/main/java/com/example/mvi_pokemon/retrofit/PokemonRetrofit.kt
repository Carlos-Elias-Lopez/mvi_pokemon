package com.example.mvi_pokemon.retrofit

import retrofit2.http.GET

interface PokemonRetrofit {
    @GET("pokemon")
    suspend fun get(): List<PokemonNetworkEntity>
}