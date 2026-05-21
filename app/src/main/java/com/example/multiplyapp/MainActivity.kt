package com.example.multiplyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    val edtNum1 = findViewById<EditText>(R.id.editTextText)
    val edtNum2 = findViewById<EditText>(R.id.editTextText2)
    val btnCalc = findViewById<Button>(R.id.button)
    val txtAns = findViewById<TextView>(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener {
            val num1 = edtNum1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = edtNum2.text.toString().toDoubleOrNull() ?: 0.0
            val result = multiply(num1, num2)
            txtAns.text = "Answer: $result"
        }
    }

    // Function to calculate the product
    fun multiply(a: Double, b: Double): Double {
        return a * b



    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}