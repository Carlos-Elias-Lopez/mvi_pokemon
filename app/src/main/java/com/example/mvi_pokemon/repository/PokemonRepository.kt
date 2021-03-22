package com.example.mvi_pokemon.repository

import com.example.mvi_pokemon.retrofit.NetworkMapper
import com.example.mvi_pokemon.retrofit.PokemonRetrofit
import com.example.mvi_pokemon.room.CacheMapper
import com.example.mvi_pokemon.room.PokemonDao
import com.example.mvi_pokemon.utils.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokemonRepository constructor(
    private val catDao: PokemonDao,
    private val catRetrofit: PokemonRetrofit,

    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
) {
    suspend fun getCats(): Flow<DataState> = flow {

    }
}