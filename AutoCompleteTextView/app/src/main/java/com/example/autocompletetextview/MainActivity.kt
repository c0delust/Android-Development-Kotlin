package com.example.autocompletetextview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    private val programming_languages = arrayOf(
        "HTML", "CSS", "Java", "Kotlin", "Dart", "Python", "JavaScript", "ASP", "VB.Net", "C", "C+", "C#"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1, programming_languages
        )
        val autoCompleteTextView = findViewById<View>(R.id.autoComplete) as AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter)
        autoCompleteTextView.threshold = 1
    }
}