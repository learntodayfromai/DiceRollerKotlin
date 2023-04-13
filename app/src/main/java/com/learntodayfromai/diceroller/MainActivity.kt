package com.learntodayfromai.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val myText: TextView = findViewById(R.id.textView)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val myText: TextView = findViewById(R.id.textView)
        val dice = Dice(6)
        val rollDice = dice.roll()
        myText.text = rollDice.toString()
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}