package com.example.mvi_pokemon.di

import android.app.Application
import com.example.mvi_pokemon.utils.AdapterPokemons
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AdapterModule {

    @Singleton
    @Provides
    fun provideAdapterGenres(application: Application): AdapterPokemons {
        return AdapterPokemons()
    }
}