package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.activity_circulo)
        val circulo:Button = findViewById(R.id.circulo)

        circulo.setOnClickListener{
            var v1: Intent = Intent(this,Circulo::class.java)
            startActivity(v1)
        }

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.activity_triangulo)
        val triangulo:Button = findViewById(R.id.triangulo)

        triangulo.setOnClickListener{
            var v2: Intent = Intent(this,Triangulo::class.java)
            startActivity(v2)
        }

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.activity_triangulo)
        val cuadrado:Button = findViewById(R.id.cuadrado)

        cuadrado.setOnClickListener{
            var v3: Intent = Intent(this,Cuadrado::class.java)
            startActivity(v3)
        }

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.activity_triangulo)
        val trapecio:Button = findViewById(R.id.trapecio)

        trapecio.setOnClickListener{
            var v4: Intent = Intent(this,Trapecio::class.java)
            startActivity(v4)
        }

        val Salir = findViewById<Button>(R.id.Salir)
        Salir.setOnClickListener {
            finishAffinity()
        }



    }
}