package com.example.progressdialog

import android.app.ProgressDialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var showButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showButton = findViewById(R.id.showButton)

        showButton.setOnClickListener{
            var progressDialog = ProgressDialog(this)
            progressDialog.setTitle("File Downloading")
            progressDialog.setMessage("Please Wait !")
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            progressDialog.show()

            object : Thread() {
                override fun run() {
                    for (i in 0..100) {
                        progressDialog.setProgress(i)
                        try {
                            sleep(200)
                        } catch (e: InterruptedException) {
                        }
                    }
                }
            }.start()
        }
    }
}