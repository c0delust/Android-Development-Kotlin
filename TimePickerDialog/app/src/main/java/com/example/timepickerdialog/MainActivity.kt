package com.example.timepickerdialog

import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    var timePickerDialog: TimePickerDialog? = null
    private lateinit var c: Calendar;
    private lateinit var showButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showButton = findViewById(R.id.showButton)

        c = Calendar.getInstance()

        showButton.setOnClickListener {
            timePickerDialog = TimePickerDialog(
                this,
                { view, hour, minute ->
                    Toast.makeText(
                        this@MainActivity,
                        "Hour: $hour Minute: $minute",
                        Toast.LENGTH_SHORT
                    ).show()
                }, c.get(
                    Calendar.HOUR_OF_DAY
                ), c.get(Calendar.MINUTE), false
            )

            timePickerDialog!!.show()
        }
    }
}