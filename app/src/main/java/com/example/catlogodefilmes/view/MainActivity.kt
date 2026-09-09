package com.example.catlogodefilmes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catlogodefilmes.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val edtLogin = findViewById<EditText>(R.id.edt_login_usuario)
        val edtSenha = findViewById<EditText>(R.id.edt_login_senha)
        val btnEntrar = findViewById<Button>(R.id.btn_login_entrar)


        btnEntrar.setOnClickListener {
            val login = edtLogin.text.toString()
            val senha = edtSenha.text.toString()

            // Login e senha Hardcoded:
            // Login: admin
            // Senha: password

            if (login == "admin" && senha == "password") {
                val intent = Intent(this, CadastroFilmesActivity::class.java)

                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}