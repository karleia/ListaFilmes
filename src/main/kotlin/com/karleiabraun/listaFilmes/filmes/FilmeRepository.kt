package com.karleiabraun.listaFilmes.filmes

import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying

interface FilmeRepository: JpaRepository<Filme, Long> {

    fun findByUserId(userId: String): List<Filme>

    @Modifying
    @Transactional
    fun deleteByUserId(userId: String)
}