package com.example.mvi_pokemon.room

import com.example.mvi_pokemon.model.Pokemon
import com.example.mvi_pokemon.utils.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
constructor():
    EntityMapper<PokemonCacheEntity, Pokemon> {
    override fun mapFromEntity(entity: PokemonCacheEntity): Pokemon {
        return Pokemon(
            id = entity.id,
            name = entity.name,
            url = entity.url,
            height = entity.height,
            width = entity.width
        )
    }

    override fun mapToEntity(domainModel: Pokemon): PokemonCacheEntity {
        return PokemonCacheEntity(
            id = domainModel.id,
            name = domainModel.name,
            url = domainModel.url,
            height = domainModel.height,
            width = domainModel.width
        )
    }
}