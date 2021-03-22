package com.example.mvi_pokemon.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PokemonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(catEntity: PokemonCacheEntity): Long
    @Query("select * from pokemon")
    suspend fun get(): List<PokemonCacheEntity>
}