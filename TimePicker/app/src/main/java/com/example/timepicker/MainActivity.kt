package com.example.timepicker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var timePicker : TimePicker
    private lateinit var textView : TextView
    private lateinit var showButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timePicker = findViewById(R.id.timePicker)
        textView = findViewById(R.id.textView)
        showButton = findViewById(R.id.showButton)

        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            textView.text = "Hours: $hourOfDay Minutes: $minute"
        }

        showButton.setOnClickListener {
            val hourOfDay = timePicker.hour
            val minute = timePicker.minute
            val is24HourView = timePicker.is24HourView

            textView.text = "Hour: $hourOfDay Minute: $minute\n\nIs 24 Hour View: $is24HourView"
        }
    }
}