package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import com.example.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var tipAmount : Double = 0.0
    var totalAmount : Double = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }


    fun calculateMoney(){
        //getting cost input from user.
        val stringInInputField = binding.idInputNumberCost.text.toString()
        val costOfBill = stringInInputField.toInt()

        //Find the checked radio button, so percentage.
        val idSelectedTipPercentage = binding.idRadioButtonGroup.checkedRadioButtonId
        val choosenService = when(idSelectedTipPercentage){
            R.id.idRadioAmazing -> 0.20
            R.id.idRadioGood -> 0.18
            else -> 0.15
        }

        this.tipAmount= costOfBill*choosenService
        this.totalAmount=costOfBill*(1+choosenService)
    }


}
