package com.example.mvi_pokemon.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PokemonCacheEntity::class], version = 1)
abstract class PokemonDatabase : RoomDatabase() {
    companion object{
        val DATABASE_NAME = "CatDB"
    }
    abstract fun pokemonDao(): PokemonDao
}