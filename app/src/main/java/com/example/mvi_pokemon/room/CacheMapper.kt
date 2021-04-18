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
            url = entity.url
        )
    }

    override fun mapToEntity(domainModel: Pokemon): PokemonCacheEntity {
        return PokemonCacheEntity(
            id = 0,
            name = domainModel.name,
            url = domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<PokemonCacheEntity>): List<Pokemon>{
        return entities.map { mapFromEntity(it) }
    }
}