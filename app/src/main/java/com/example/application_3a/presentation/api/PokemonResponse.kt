package com.example.application_3a.presentation.api

import com.example.application_3a.presentation.list.Pokemon

data class PokemonResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)