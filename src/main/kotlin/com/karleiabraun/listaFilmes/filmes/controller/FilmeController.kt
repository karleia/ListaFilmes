package com.karleiabraun.listaFilmes.filmes.controller

import com.karleiabraun.listaFilmes.filmes.FilmeService
import com.karleiabraun.listaFilmes.filmes.controller.requests.FilmeRequest
import com.karleiabraun.listaFilmes.filmes.controller.responses.FilmeResponse
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/filmes")
class FilmeController(
    private val service: FilmeService
) {
    @PostMapping
    fun save(@Valid @RequestBody req: FilmeRequest): FilmeResponse {
        val filme = service.saveFilme(req.toFilme())
        return FilmeResponse.from(filme)
    }

    @GetMapping("/{userId}")
    fun list(@PathVariable userId: String): List<FilmeResponse> =
        service.listFilme(userId).map(FilmeResponse::from)


    @DeleteMapping("/user/{userId}")
    fun deleteByUser(@PathVariable userId: String) {
        println("teste aqui no delete ${userId}")
        service.deleteListUser(userId)
    }
}