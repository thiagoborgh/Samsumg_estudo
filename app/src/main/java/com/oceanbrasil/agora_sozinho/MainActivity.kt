package com.oceanbrasil.agora_sozinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etSobrenome = findViewById<EditText>(R.id.etSobrenome)
        val btEnviar = findViewById<Button>(R.id.btEnviar)

        btEnviar.setOnClickListener {

            if (etNome.text.isNotBlank()) {
                tvResultado.text = getString(R.string.Hello_Name, etNome.text.toString())

            } else {
                etNome.error = getString(R.string.type_your_name)
                }




        }



    }
}