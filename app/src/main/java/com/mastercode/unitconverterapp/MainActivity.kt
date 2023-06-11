package com.mastercode.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var resultText: TextView
    lateinit var button: Button
    lateinit var kiloInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        addListener()
    }

    private fun initViews() {
        resultText = findViewById<TextView>(R.id.resultText)
        button = findViewById<Button>(R.id.btn)
        kiloInput = findViewById(R.id.kilo_edit)
    }

    private fun addListener() {
        button.setOnClickListener() {
            val kilos: Double = kiloInput.text.toString().toDouble()

            resultText.setText(convertToPounds(kilos) + "\nPounds")
        }
    }

    private fun convertToPounds(kilos: Double): String {
        return (kilos * 2.20462).toString()
    }
}