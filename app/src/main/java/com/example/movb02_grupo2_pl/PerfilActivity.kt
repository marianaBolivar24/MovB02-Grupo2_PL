package com.example.movb02_grupo2_pl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil)

        val gurdarButton = findViewById<Button>(R.id.button_guardar)
        val cerrarSesion_button = findViewById<Button>(R.id.button_csesion)


        gurdarButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java) // Usar la importación
            startActivity(intent)
            finish()

        }

        cerrarSesion_button.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java) // Usar la importación
            startActivity(intent)
            finish()

        }
    }


}