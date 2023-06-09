package com.example.lemonade

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lemonade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var lemodaneCount = 0

    lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idImageView.setOnLongClickListener {
            binding.idTextView.text = "Drinked lemonades count is : $lemodaneCount"
            true
        }
        pickLemon()

    }

    @SuppressLint("SetTextI18n")
    fun pickLemon() {
        binding.idTextView.text = "Pick the lemon from tree"
        binding.idImageView.setImageResource(R.drawable.lemon_tree)

        binding.idImageView.setOnClickListener {
            squezeLemon()
        }
    }

    @SuppressLint("SetTextI18n")
    fun squezeLemon() {
        binding.idTextView.text = "Squeze the lemon"
        binding.idImageView.setImageResource(R.drawable.lemon_squeeze)

        binding.idImageView.setOnClickListener {
            drinkLemonade()
        }
    }

    @SuppressLint("SetTextI18n")
    fun drinkLemonade() {
        binding.idTextView.text = "Drink the lemonade"
        binding.idImageView.setImageResource(R.drawable.lemon_drink)
        lemodaneCount++

        binding.idImageView.setOnClickListener {
            rePickLemon()
        }
    }

    @SuppressLint("SetTextI18n")
    fun rePickLemon() {
        binding.idTextView.text = "Go to the lemon tree"
        binding.idImageView.setImageResource(R.drawable.lemon_restart)

        binding.idImageView.setOnClickListener {
            pickLemon()
        }
    }

}