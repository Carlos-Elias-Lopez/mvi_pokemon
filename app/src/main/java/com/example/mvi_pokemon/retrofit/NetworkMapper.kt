package com.example.mvi_pokemon.retrofit

import com.example.mvi_pokemon.model.Pokemon
import com.example.mvi_pokemon.utils.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor(): EntityMapper<PokemonNetworkEntity, Pokemon> {
    override fun mapFromEntity(entity: PokemonNetworkEntity): Pokemon {
        return Pokemon(
            id = null,
            name = entity.name,
            url = entity.url
        )
    }


    override fun mapToEntity(domainModel: Pokemon): PokemonNetworkEntity {
        return PokemonNetworkEntity(
            name = domainModel.name,
            url = domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<PokemonNetworkEntity>): List<Pokemon>{
        return entities.map { mapFromEntity(it) }
    }
}