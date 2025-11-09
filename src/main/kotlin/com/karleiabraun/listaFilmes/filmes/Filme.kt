package com.karleiabraun.listaFilmes.filmes

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "filmes")
class Filme (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:NotBlank
    @Column(nullable = false)
    var userId: String,

    @field:NotBlank
    @Column(nullable = false, length = 200)
    var title: String,

    @Column
    var duration: String? = "0:00",

    @Column
    var gender: String? = "",

    @Column(columnDefinition = "text")
    var description: String? = "",
) {
    constructor() : this(
        id = null,
        userId = "",
        title = "",
        duration = null,
        gender = null,
        description = null
    )
}