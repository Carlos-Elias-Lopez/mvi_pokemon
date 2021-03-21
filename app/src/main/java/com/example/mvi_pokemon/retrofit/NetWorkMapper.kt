package com.example.mvi_pokemon.retrofit

import com.example.mvi_pokemon.model.Pokemon
import com.example.mvi_pokemon.utils.EntityMapper
import javax.inject.Inject

class NetWorkMapper
@Inject
constructor(): EntityMapper<PokemonNetworkEntity, Pokemon> {
    override fun mapFromEntity(entity: PokemonNetworkEntity): Pokemon {
        return Pokemon(
            name = entity.name,
            url = entity.url,
            height = entity.height,
            width = entity.width
        )
    }


    override fun mapToEntity(domainModel: Pokemon): PokemonNetworkEntity {
        return PokemonNetworkEntity(
            name = domainModel.name,
            url = domainModel.url,
            height = domainModel.height,
            width = domainModel.width
        )
    }
}