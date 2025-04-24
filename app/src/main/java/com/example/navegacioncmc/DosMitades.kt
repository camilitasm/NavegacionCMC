package com.example.navegacioncmc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DosMitades : AppCompatActivity() {

    private lateinit var editTextInput: EditText
    private lateinit var buttonProcess: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos_mitades)

        editTextInput = findViewById(R.id.editTextInput)
        buttonProcess = findViewById(R.id.buttonProcess)
        textViewResult = findViewById(R.id.textViewResult)

        buttonProcess.setOnClickListener {
            val input = editTextInput.text.toString()
            textViewResult.text = if (input.isNotEmpty()) {
                dosMitades(input)
            } else {
                "Por favor, ingresa una cadena válida."
            }
        }
    }

    private fun dosMitades(input: String): String {
        val mitad = input.length / 2
        val primeraMitad = if (input.length % 2 == 0) input.substring(0, mitad) else input.substring(0, mitad + 1)
        val segundaMitad = if (input.length % 2 == 0) input.substring(mitad) else input.substring(mitad + 1)
        return segundaMitad + primeraMitad
    }
}