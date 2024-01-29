package com.example.actionmenuview
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ActionMenuView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val actionMenuView: ActionMenuView = findViewById(R.id.action_menu_view)

        menuInflater.inflate(R.menu.main_menu, actionMenuView.menu)

        toolbar.setOnMenuItemClickListener{
                menuItem ->
            when (menuItem.itemId) {
                R.id.menu_item1 -> {
                    showToast("Item 1 clicked")
                    true
                }
                R.id.menu_item2 -> {
                    showToast("Item 2 clicked")
                    true
                }
                else -> false
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}
