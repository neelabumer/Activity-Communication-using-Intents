package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button1)
        button.setBackgroundColor(Color.MAGENTA)
        button.setOnClickListener{
            val intent = Intent(this,Page1::class.java)
            startActivity(intent)
        }
    }
}