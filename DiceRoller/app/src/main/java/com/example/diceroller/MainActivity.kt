package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstDice = Dice(6)

        val rollButton : Button = findViewById(R.id.rollButton)
        val resultText : TextView = findViewById(R.id.resultTextDice)

        rollButton.setOnClickListener{
            Toast.makeText(this,"Dice Rolled! \uD83C\uDFB2 ",Toast.LENGTH_SHORT).show()

            when(firstDice.rollDice()){
                1 -> resultText.text = "1"
                2 -> resultText.text = "2"
                3 -> resultText.text = "3"
                4 -> resultText.text = "4"
                5 -> resultText.text = "5"
                6 -> resultText.text = "6"
            }
        }



    }


}

class Dice(val sides : Int){

    fun rollDice() : Int{

        return (1..sides).random()
    }
}