package com.example.androidtutorial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidtutorial.ui.theme.AndroidTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.welcome_txt)
        val inputField = findViewById<EditText>(R.id.enter_txt)
        val submitButtonView = findViewById<Button>(R.id.submit_btn)
       submitButtonView.setOnClickListener{
           val enteredName = inputField.text.toString()
           val message = "Hello $enteredName!!!"
           greetingTextView.text = message
           inputField.text.clear()

       }

    }
}
