package com.example.diseno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diseno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //**
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //***
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSuma.setOnClickListener{
           // suma()
            val num2 = binding.ed2.text.toString()
            val num1 = binding.ed1.text.toString()

        }

        binding.btnResta.setOnClickListener{
           //resta()
        }

        binding.btnMulti.setOnClickListener{
           // multi()
        }

        binding.btnDiv.setOnClickListener{
           // div()
        }
    }

    private fun div(num1: Int, num2: Int): Int {
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value_2 = num2.toInt()
        var total = clean_value + clean_value_2
        return total
    }

    private fun multi(num1: Int, num2: Int) : Int{
        val clean_value = num1.toInt()
        val clean_value_2 = num2.toInt()
        var total = clean_value + clean_value_2
        return total
    }

    private fun resta(num1: Int, num2: Int) : Int{
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value_2 = num2.toInt()
        var total = clean_value + clean_value_2
        return total
    }

    private fun suma(num1: Int, num2: Int) : Int{
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value_2 = num2.toInt()
        var total = clean_value + clean_value_2
        return total
    }
}