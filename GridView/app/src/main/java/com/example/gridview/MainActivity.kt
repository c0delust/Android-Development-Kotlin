package com.example.gridview

import MainAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    private var playerNames = arrayOf(
        "\uD83C\uDDE6\uD83C\uDDE9\n Andorra",
        "\uD83C\uDDE6\uD83C\uDDEA\n United Arab Emirates ",
        "\uD83C\uDDE6\uD83C\uDDEB\n Afghanistan",
        "\uD83C\uDDE6\uD83C\uDDEC\n Antigua and Barbuda ",
        "\uD83C\uDDE6\uD83C\uDDEE\n Anguilla",
        "\uD83C\uDDE6\uD83C\uDDF2\n Armenia",
        "\uD83C\uDDE6\uD83C\uDDF4\n Angola",
        "\uD83C\uDDE6\uD83C\uDDF6\n Antarctica",
        "\uD83C\uDDE6\uD83C\uDDF7\n Argentina",
        "\uD83C\uDDE6\uD83C\uDDF8\n American Samoa",
        "\uD83C\uDDE6\uD83C\uDDF9\n Austria",
        "\uD83C\uDDE6\uD83C\uDDFA\n Australia ",
        "\uD83C\uDDE6\uD83C\uDDFC\n Aruba ",
        "\uD83C\uDDE6\uD83C\uDDFD\n Åland Islands ",
        "\uD83C\uDDE6\uD83C\uDDFF\n Azerbaijan ",
        "\uD83C\uDDE7\uD83C\uDDE6\n Bosnia and Herzegovina",
        "\uD83C\uDDE7\uD83C\uDDE7\n Barbados",
        "\uD83C\uDDE7\uD83C\uDDE9\n Bangladesh",
        "\uD83C\uDDE7\uD83C\uDDEA\n Belgium",
        "\uD83C\uDDE7\uD83C\uDDEC\n Bulgaria"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "GridView"
        gridView = findViewById(R.id.gridView)

        val mainAdapter = MainAdapter(this, playerNames)
        gridView.adapter = mainAdapter
    }
}