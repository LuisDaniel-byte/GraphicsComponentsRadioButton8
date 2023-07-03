package com.example.graphicscomponentsradiobutton8

import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PreguntaMultiple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.multiple_pregunta)

        val button = findViewById<Button>(R.id.btnSend)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)


        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioButton1 -> {
                    Toast.makeText(this, "Respuesta erronea", Toast.LENGTH_LONG).show()
                    button.isEnabled = false
                }

                R.id.radioButton2 -> {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show()
                    button.isEnabled = true
                }

                R.id.radioButton3 -> {
                    Toast.makeText(this, "Respuesta erronea", Toast.LENGTH_LONG).show()
                    button.isEnabled = false
                }

                R.id.radioButton4 -> {
                    Toast.makeText(this, "Respuesta erronea", Toast.LENGTH_LONG).show()
                    button.isEnabled = false
                }
            }
                     button.setOnClickListener {
                      Toast.makeText(this, "Boton habilitado", Toast.LENGTH_LONG).show()
                     }

        }
    }
}
