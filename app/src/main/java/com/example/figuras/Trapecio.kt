package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class Trapecio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapecio)

        val Enviar = findViewById<Button>(R.id.Enviar)
        val baseM = findViewById<EditText>(R.id.baseM)
        val baseMenor = findViewById<EditText>(R.id.baseMenor)
        val altura = findViewById<EditText>(R.id.altura)
        val resultado = findViewById<TextView>(R.id.resultado)

        Enviar.setOnClickListener {
            val baseMayor = baseM.text.toString().toFloatOrNull()
            val baseMenor = baseMenor.text.toString().toFloatOrNull()
            val altura = altura.text.toString().toFloatOrNull()

            if (baseMayor != null && baseMenor != null && altura != null) {
                val area = calcularAreaTrapecio(baseMayor, baseMenor, altura)
                resultado.text = "El área del trapecio es de: $area cm"
            } else {
                resultado.text = "Por favor, introduce valores válidos para las bases y la altura."
            }
        }
        val Regresar: Button = findViewById(R.id.Regresar)
        Regresar.setOnClickListener{
            var v2: Intent = Intent(this,MainActivity::class.java)
            startActivity(v2)
        }

        val Limpiar = findViewById<Button>(R.id.Limpiar)
        Limpiar.setOnClickListener {
            baseM.text.clear()
            baseMenor.text.clear()
            altura.text.clear()
            resultado.text = " "
        }//Fin de Button (btnLimpiar)

    }

    private fun calcularAreaTrapecio(baseMayor: Float, baseMenor: Float, altura: Float): Float {
        return ((baseMayor + baseMenor) * altura) / 2
    }

}