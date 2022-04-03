package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val button: Button = findViewById(R.id.button2)
        button.setBackgroundColor(Color.DKGRAY)
        button.setOnClickListener {
            val intent = Intent(this, Page2::class.java)
            startActivity(intent)
        }
    }
}