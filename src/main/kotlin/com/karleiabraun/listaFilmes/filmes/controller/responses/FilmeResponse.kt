package com.karleiabraun.listaFilmes.filmes.controller.responses

import com.karleiabraun.listaFilmes.filmes.Filme

class FilmeResponse(
    val id: Long,
    val userId: String,
    val title: String,
    val duration: String?,
    val gender: String?,
    val description: String?
) {
    companion object {
        fun from(entity: Filme) = FilmeResponse(
            id = entity.id ?: 0,
            userId = entity.userId,
            title = entity.title,
            duration = entity.duration,
            gender = entity.gender,
            description = entity.description
        )
    }
}