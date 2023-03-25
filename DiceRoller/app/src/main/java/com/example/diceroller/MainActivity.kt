package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstDice = Dice(6)
        println("Obtained dice is : ${firstDice.rollDice()}")


    }


}

class Dice(val sides : Int){

    fun rollDice() : Int{

        return (1..sides).random()
    }
}