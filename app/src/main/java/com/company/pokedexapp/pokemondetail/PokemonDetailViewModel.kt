package com.company.pokedexapp.pokemondetail

import androidx.lifecycle.ViewModel
import com.company.pokedexapp.data.remote.responses.Pokemon
import com.company.pokedexapp.repository.PokemonRepository
import com.company.pokedexapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}