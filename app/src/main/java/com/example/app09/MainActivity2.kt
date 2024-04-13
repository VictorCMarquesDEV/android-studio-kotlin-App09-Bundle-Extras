package com.example.app09

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app09.databinding.ActivityMain2Binding

class MainActivity2 : ComponentActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent
        val bundle = i.extras

        binding.buttonOK.setOnClickListener {
            val numero = binding.editNumero.text.toString().trim().toInt()

            val i = Intent(this, MainActivity3::class.java)

            if (bundle != null) {
                i.putExtras(bundle)
            }
            i.putExtra("n2", numero)
            startActivity(i)
        }
    }
}