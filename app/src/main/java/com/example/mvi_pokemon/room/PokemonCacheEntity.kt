package com.example.mvi_pokemon.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "pokemon")
class PokemonCacheEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "url")
    var url: String
)