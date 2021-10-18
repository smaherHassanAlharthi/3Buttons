package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val   text = intent.getStringExtra("text")
        val tvtext=findViewById<TextView>(R.id.tvTexts)
        tvtext.text=text

    }
}