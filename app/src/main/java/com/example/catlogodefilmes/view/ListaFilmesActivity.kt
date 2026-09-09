package com.example.catlogodefilmes.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.catlogodefilmes.R
import com.example.catlogodefilmes.adapter.FilmeAdapter
import com.example.catlogodefilmes.dao.FilmeDao
import com.example.catlogodefilmes.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaFilmesActivity : AppCompatActivity(R.layout.activity_lista_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val rvLista = findViewById<RecyclerView>(R.id.rv_lista_filmes)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_lista_voltar)

        rvLista.adapter = FilmeAdapter(FilmeDao.buscar())
        rvLista.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}