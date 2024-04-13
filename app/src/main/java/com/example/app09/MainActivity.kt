package com.example.app09

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app09.databinding.ActivityMainBinding

// App09: Bundle de Extras, passar um valor para outro Activity

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOK.setOnClickListener {
            val numero = binding.editNumero.text.toString().trim().toInt()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("n1", numero)
            startActivity(i)
        }
    }
}
