package com.example.app09

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app09.databinding.ActivityMain3Binding

class MainActivity3 : ComponentActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent
        val numero1 = i.extras?.getInt("n1")
        val numero2 = i.extras?.getInt("n2")

        if (numero1 != null && numero2 != null){
            val soma = numero1!! + numero2!!
            binding.textResultado.text = "Soma: $soma"
        } else {
            binding.textResultado.text = "Erro ao passar os valores"
        }

        binding.buttonVoltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}