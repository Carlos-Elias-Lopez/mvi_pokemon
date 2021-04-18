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


)


data class PokemonsAPIResponse(
        @SerializedName("count")
        @Expose
        val count : Integer,

        @SerializedName("results")
        @Expose
        val results: List<PokemonNetworkEntity>
)