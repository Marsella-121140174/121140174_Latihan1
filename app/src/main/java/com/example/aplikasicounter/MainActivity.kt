package com.example.aplikasicounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private lateinit var increaseButton: Button
    private lateinit var decreaseButton: Button

    private var counterValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)
        increaseButton = findViewById(R.id.increaseButton)
        decreaseButton = findViewById(R.id.decreaseButton)

        updateCounterText()

        increaseButton.setOnClickListener {
            increaseCounter()
        }

        decreaseButton.setOnClickListener {
            decreaseCounter()
        }
    }

    private fun increaseCounter() {
        counterValue++
        updateCounterText()
    }

    private fun decreaseCounter() {
        if (counterValue > 0) {
            counterValue--
            updateCounterText()
        }
    }

    private fun updateCounterText() {
        counterTextView.text = counterValue.toString()
    }
}
