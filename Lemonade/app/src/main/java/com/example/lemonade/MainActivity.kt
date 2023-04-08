package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lemonade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var lemodaneCount =0

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idTextView.text="Pick the lemon from tree"
        binding.idImageView.setImageResource(R.drawable.lemon_tree)

    }

    fun pickLemon(){

    }

    fun squezeLemon(){

    }

    fun drinkLemonade(){

    }

    fun rePickLemon(){

    }

}