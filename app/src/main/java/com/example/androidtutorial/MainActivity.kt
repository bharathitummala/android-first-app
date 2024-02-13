package com.example.androidtutorial

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG", "MainActivity: onCreate")
        val greetingTextView = findViewById<TextView>(R.id.welcome_txt)
        val inputField = findViewById<EditText>(R.id.enter_txt)
        val submitButtonView = findViewById<Button>(R.id.submit_btn)
        val viewOfferBtnView = findViewById<Button>(R.id.btnoffers)
        var enteredName = ""
       submitButtonView.setOnClickListener {
           enteredName = inputField.text.toString()
           if (enteredName == "") {
               viewOfferBtnView.visibility = INVISIBLE
               greetingTextView.text = ""
               Toast.makeText(this@MainActivity, "Please enter name!", Toast.LENGTH_SHORT).show()
           } else {
               val message = "Hello $enteredName!!!"
               greetingTextView.text = message
               inputField.text.clear()
               viewOfferBtnView.visibility = VISIBLE

           }
       }
           viewOfferBtnView.setOnClickListener{
               val intent = Intent(this,SecondActivity::class.java)
               intent.putExtra("USER",enteredName)
               startActivity(intent)
           }
       }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG", "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")
    }
}