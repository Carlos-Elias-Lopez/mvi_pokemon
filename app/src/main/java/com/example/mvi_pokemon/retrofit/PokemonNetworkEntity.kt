package com.example.mvi_pokemon.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PokemonNetworkEntity (
    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("url")
    @Expose
    var url: String,

    @SerializedName("width")
    @Expose
    var width: Int,

    @SerializedName("height")
    @Expose
    var height: Int,
)