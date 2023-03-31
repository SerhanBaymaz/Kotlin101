package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton : Button = findViewById(R.id.idButtonCalculate)
        calculateButton.setOnClickListener{
            Toast.makeText(this,"Calculated.",Toast.LENGTH_SHORT).show()


        }
    }
}