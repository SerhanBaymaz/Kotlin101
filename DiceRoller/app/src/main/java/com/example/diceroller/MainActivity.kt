package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstDice = Dice(6)

        val rollButton : Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener{
            Toast.makeText(this,"Dice Rolled! \uD83C\uDFB2 ",Toast.LENGTH_SHORT).show()
        }
    }


}

class Dice(val sides : Int){

    fun rollDice() : Int{

        return (1..sides).random()
    }
}