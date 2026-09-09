package com.example.catlogodefilmes.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catlogodefilmes.R
import com.example.catlogodefilmes.dao.FilmeDao
import com.example.catlogodefilmes.model.Filme

class ListaFilmesActivity : AppCompatActivity(R.layout.activity_lista_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTitulo = findViewById<EditText>(R.id.edt_cadastro_titulo)
        val edtGenero = findViewById<EditText>(R.id.edt_cadastro_genero)
        val edtURL = findViewById<EditText>(R.id.edt_cadastro_url)

        val btnCadastrar = findViewById<Button>(R.id.btn_cadastro_ok)

        btnCadastrar.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val genero = edtGenero.text.toString()
            val url = edtURL.text.toString()

            FilmeDao.adicionar(Filme(titulo, genero, url))

            Toast.makeText(this, "Filme cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }
}