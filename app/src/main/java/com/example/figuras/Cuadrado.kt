package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Cuadrado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadrado)

        val Enviar = findViewById<Button>(R.id.Enviar)
        val dato = findViewById<EditText>(R.id.dato)
        val resultado = findViewById<TextView>(R.id.resultado)

        Enviar.setOnClickListener {
            val lado = dato.text.toString().toFloatOrNull()

            if (lado != null && lado > 0) {
                val area = calcularAreaCuadrado(lado)
                resultado.text = "El área del cuadrado es de: $area cm"
            } else {
                resultado.text = "Por favor, introduce un valor válido para el lado del cuadrado."
            }
        }

        val Regresar: Button = findViewById(R.id.Regresar)

        Regresar.setOnClickListener{
            var v2: Intent = Intent(this,MainActivity::class.java)
            startActivity(v2)
        }
        val Limpiar = findViewById<Button>(R.id.Limpiar)

        Limpiar.setOnClickListener {
            dato.text.clear()
            resultado.text = " "
        }//Fin de Button (btnLimpiar)

    }

    private fun calcularAreaCuadrado(lado: Float): Float {
        return lado * lado
    }
}