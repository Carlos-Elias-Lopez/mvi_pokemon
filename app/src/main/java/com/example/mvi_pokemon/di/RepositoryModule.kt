package com.example.mvi_pokemon.di

import com.example.mvi_pokemon.repository.PokemonRepository
import com.example.mvi_pokemon.retrofit.NetworkMapper
import com.example.mvi_pokemon.retrofit.PokemonRetrofit
import com.example.mvi_pokemon.room.CacheMapper
import com.example.mvi_pokemon.room.PokemonDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
   object RepositoryModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        pokemonDao: PokemonDao,
        pokemonRetrofit: PokemonRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): PokemonRepository {
        return PokemonRepository(pokemonDao, pokemonRetrofit, cacheMapper, networkMapper)
    }
}