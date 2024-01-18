package com.example.datepickerdialog

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import android.text.format.DateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {
    lateinit var textView: TextView
    lateinit var button: Button

    var thisDay: Int = 0
    var thisMonth: Int = 0
    var thisYear: Int = 0
    var thisHour: Int = 0
    var thisMinute: Int = 0
    val calendar: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "DatePickerDialog"

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val datePickerDialog =
                DatePickerDialog(
                    this@MainActivity,
                    this@MainActivity,
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
                )
            datePickerDialog.show()
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        thisDay = dayOfMonth
        thisYear = year
        thisMonth = month + 1

        thisHour = calendar.get(Calendar.HOUR)
        thisMinute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this@MainActivity, this@MainActivity, thisHour, thisMinute,
            DateFormat.is24HourFormat(this)
        )
        timePickerDialog.show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        thisHour = hourOfDay
        thisMinute = minute
        textView.text =
            "Date: " + thisDay + "/" + thisMonth + "/" + thisYear + " | Time: " + thisHour + ":" + thisMinute
    }
}