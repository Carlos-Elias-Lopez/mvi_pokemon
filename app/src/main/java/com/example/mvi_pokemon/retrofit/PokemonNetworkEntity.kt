package com.example.mvi_pokemon.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PokemonNetworkEntity (
    @SerializedName("id")
    @Expose
    var id: String,

    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("url")
    @Expose
    var url: String,


)