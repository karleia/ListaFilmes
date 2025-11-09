package com.karleiabraun.listaFilmes.filmes

import org.springframework.stereotype.Service

@Service
class FilmeService(
    private val repository: FilmeRepository
) {
    fun saveFilme(filme: Filme): Filme {
        return repository.save(filme)
    }

    fun listFilme(userId: String): List<Filme> {
        println("Buscando filmes do userId = $userId")
        return repository.findByUserId(userId)
    }

    fun deleteListUser(userId: String) {
        repository.deleteByUserId(userId)
    }
}