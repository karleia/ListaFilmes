package com.karleiabraun.listaFilmes.filmes.controller.requests

import com.karleiabraun.listaFilmes.filmes.Filme
import jakarta.validation.constraints.NotBlank

data class FilmeRequest(
    @field:NotBlank val userId: String,
    @field:NotBlank val title: String,
    val duration: String? = null,
    val gender: String? = null,
    val description: String? = null
) {
    fun toFilme() = Filme(
        userId = userId,
        title = title,
        duration = duration,
        gender = gender,
        description = description
    )
}