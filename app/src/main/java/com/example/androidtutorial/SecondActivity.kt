package com.example.androidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvoff)
        val message = "$userName ,you will get  free access to all the content for one month "
        textView.text = message
    }
}