package com.learntodayfromai.diceroller

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }

        rollDice()
    }

    private fun rollDice() {
        val myImage: ImageView = findViewById(R.id.imageView)
        val dice = Dice(4)
        val rollDice = dice.roll()
        val luckyNumber = 3
        var printText : Drawable
        val drawableResource = when (rollDice){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            else -> R.drawable.dice_4
        }


        myImage.setImageResource(drawableResource)
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}