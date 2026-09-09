package com.example.catlogodefilmes.dao

import com.example.catlogodefilmes.model.Filme

class FilmeDao {
    companion object {
        private val listaFilmes: MutableList<Filme> = mutableListOf()

        fun adicionar(filme: Filme) {
            listaFilmes.add(filme)
        }

        fun buscar(): List<Filme> {
            return listaFilmes
        }
    }
}