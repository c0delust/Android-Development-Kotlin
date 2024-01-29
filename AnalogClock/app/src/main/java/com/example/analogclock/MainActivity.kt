package com.example.analogclock

import android.os.Bundle
import android.widget.AnalogClock
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val analogClock = findViewById<AnalogClock>(R.id.analogClock)
    }
}