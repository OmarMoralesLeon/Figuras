package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Triangulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangulo)

        val Enviar = findViewById<Button>(R.id.Enviar)
        val base = findViewById<EditText>(R.id.base)
        val altura = findViewById<EditText>(R.id.altura)
        val resultado = findViewById<TextView>(R.id.resultado)

        Enviar.setOnClickListener {
            val base = base.text.toString().toFloatOrNull()
            val altura = altura.text.toString().toFloatOrNull()

            if (base != null && altura != null && base > 0 && altura > 0) {
                val area = calcularAreaTriangulo(base, altura)
                resultado.text = "El área del triángulo es de: $area cm"
            } else {
                resultado.text =
                    "Por favor, introduce valores válidos para la base y la altura."
            }
        }
        val Regresar: Button = findViewById(R.id.Regresar)

        Regresar.setOnClickListener{
            var v2: Intent = Intent(this,MainActivity::class.java)
            startActivity(v2)
        }

        val Limpiar = findViewById<Button>(R.id.Limpiar)
        Limpiar.setOnClickListener {
            base.text.clear()
            altura.text.clear()
            resultado.text = " "
        }//Fin de Button (btnLimpiar)


    }
    private fun calcularAreaTriangulo(base: Float, altura: Float): Float {
        return (base * altura) / 2
    }
}