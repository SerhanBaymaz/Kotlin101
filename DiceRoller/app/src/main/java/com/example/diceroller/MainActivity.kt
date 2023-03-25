package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        val resultText: TextView = findViewById(R.id.resultTextDice)
        val resultImage: ImageView = findViewById(R.id.diceResultİmage)

        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice Rolled! \uD83C\uDFB2 ", Toast.LENGTH_SHORT).show()

            val firstDice = Dice(6)
            var resultDiceNumber = firstDice.rollDice();

            when (resultDiceNumber) {
                1 -> resultText.text = "\uD83C\uDFB2 : 1"
                2 -> resultText.text = "\uD83C\uDFB2 : 2"
                3 -> resultText.text = "\uD83C\uDFB2 : 3"
                4 -> resultText.text = "\uD83C\uDFB2 : 4"
                5 -> resultText.text = "\uD83C\uDFB2 : 5"
                6 -> resultText.text = "\uD83C\uDFB2 : 6"
            }




            /*
            when(resultDiceNumber){
                1 -> resultImage.setImageResource(R.drawable.dice_1)
                2 -> resultImage.setImageResource(R.drawable.dice_2)
                3 -> resultImage.setImageResource(R.drawable.dice_3)
                4 -> resultImage.setImageResource(R.drawable.dice_4)
                5 -> resultImage.setImageResource(R.drawable.dice_5)
                6 -> resultImage.setImageResource(R.drawable.dice_6)
            }
            */

            val imageSource = when (resultDiceNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            resultImage.setImageResource(imageSource)


        }

    }

}

class Dice(val sides: Int) {

    fun rollDice(): Int {

        return (1..sides).random()
    }
}