package com.example.navegacioncmc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnBack = findViewById<ImageButton>(R.id.btn_back)

        // Botón de retroceso
        btnBack.setOnClickListener {
            finish() // Regresa a la actividad anterior
        }

        // Botón de ingreso
        btnLogin.setOnClickListener {
            // Navegación a DosMitades
            val intent = Intent(this@LoginActivity, DosMitades::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP // Opcional: limpia el stack de actividades
            }
            startActivity(intent)

            // Opcional: cierra esta actividad
            // finish()
        }
    }
}