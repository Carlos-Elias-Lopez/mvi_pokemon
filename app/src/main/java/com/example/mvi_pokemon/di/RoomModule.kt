package com.example.mvi_pokemon.di

import android.content.Context
import androidx.room.Room
import com.example.mvi_pokemon.room.PokemonDao
import com.example.mvi_pokemon.room.PokemonDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
   object RoomModule {

    @Singleton
    @Provides
    fun providePokemonDB(@ApplicationContext context: Context): PokemonDatabase {
        return Room
            .databaseBuilder(context, PokemonDatabase::class.java, PokemonDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun providePokemonDao(pokemonDatabase: PokemonDatabase): PokemonDao {
        return pokemonDatabase.pokemonDao()
    }
}