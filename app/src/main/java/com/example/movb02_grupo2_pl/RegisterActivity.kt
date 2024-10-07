package com.example.movb02_grupo2_pl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.movb02_grupo2_pl.R

class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // Aquí se asocia el layout con esta actividad

        val registerButton = findViewById<Button>(R.id.button_register)

        registerButton.setOnClickListener {

                val intent = Intent(this, LoginActivity::class.java) // Usar la importación
                startActivity(intent)
                finish()

        }
    }
}