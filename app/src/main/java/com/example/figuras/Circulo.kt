package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.PI
import kotlin.time.times


class Circulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo)


        val Enviar = findViewById<Button>(R.id.Enviar)
        val Radio = findViewById<EditText>(R.id.Radio)
        val resultado = findViewById<TextView>(R.id.resultado)

        Enviar.setOnClickListener {
            val radio = Radio.text.toString().toFloatOrNull()

            if (radio != null && radio > 0) {
                val area = calcularAreaCirculo(radio)
                resultado.text = "El área del círculo es de: $area cm"
            } else {
                resultado.text = "Por favor, introduce un valor válido para el radio."
            }
        }

        val Regresar: Button = findViewById(R.id.Regresar)

        Regresar.setOnClickListener{
            var v2: Intent = Intent(this,MainActivity::class.java)
            startActivity(v2)
        }

        val Limpiar = findViewById<Button>(R.id.Limpiar)
        Limpiar.setOnClickListener {
            Radio.text.clear()
            resultado.text = " "
        }//Fin de Button (btnLimpiar)

    }
    private fun calcularAreaCirculo(radio: Float): Float {
        return (PI * radio * radio).toFloat()
    }
}