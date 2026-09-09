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


    }
}