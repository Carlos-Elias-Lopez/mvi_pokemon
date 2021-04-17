package com.example.mvi_pokemon.repository

import com.example.mvi_pokemon.retrofit.NetworkMapper
import com.example.mvi_pokemon.retrofit.PokemonRetrofit
import com.example.mvi_pokemon.room.CacheMapper
import com.example.mvi_pokemon.room.PokemonDao
import com.example.mvi_pokemon.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokemonRepository constructor(
    private val pokemonDao: PokemonDao,
    private val pokemonRetrofit: PokemonRetrofit,

    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
) {
    suspend fun getPokemons(): Flow<DataState> = flow {
        emit(DataState.Loading)
        delay(1000)
        try {
            val pokemonData = pokemonRetrofit.get()
            val pokemonMap = networkMapper.mapFromEntityList(pokemonData)
            for (tempPokemon in pokemonMap){
                pokemonDao.insert(cacheMapper.mapToEntity(tempPokemon))
            }
            val cachePokemon = pokemonDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cachePokemon)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}