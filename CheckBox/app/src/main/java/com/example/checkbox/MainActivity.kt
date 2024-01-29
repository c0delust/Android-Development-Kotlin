package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val cheeseCheckBox = findViewById<CheckBox>(R.id.cheeseCheckBox)
        val pepperoniCheckBox = findViewById<CheckBox>(R.id.pepperoniCheckBox)
        val mushroomCheckBox = findViewById<CheckBox>(R.id.mushroomCheckBox)
        val oliveCheckBox = findViewById<CheckBox>(R.id.oliveCheckBox)
        val onionCheckBox = findViewById<CheckBox>(R.id.onionCheckBox)

        // Set checkbox listener
        val checkBoxListener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            val topping = buttonView.text.toString()
            val status = if (isChecked) "added to" else "removed from"
            Toast.makeText(this, "$topping $status your pizza!", Toast.LENGTH_SHORT).show()
        }

        cheeseCheckBox.setOnCheckedChangeListener(checkBoxListener)
        pepperoniCheckBox.setOnCheckedChangeListener(checkBoxListener)
        mushroomCheckBox.setOnCheckedChangeListener(checkBoxListener)
        oliveCheckBox.setOnCheckedChangeListener(checkBoxListener)
        onionCheckBox.setOnCheckedChangeListener(checkBoxListener)

    }
}