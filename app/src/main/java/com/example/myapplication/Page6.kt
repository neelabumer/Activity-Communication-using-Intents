package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val button: Button = findViewById(R.id.button7)
        button.setBackgroundColor(Color.DKGRAY)
        button.setOnClickListener {
            val intent = Intent(this, Page7::class.java)
            startActivity(intent)
        }
    }
}