package com.example.mvi_pokemon.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "pokemon")
class PokemonCacheEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: String,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "url")
    var url: String,
    @ColumnInfo(name = "width")
    var width: Int,
    @ColumnInfo(name = "height")
    var height: Int
)