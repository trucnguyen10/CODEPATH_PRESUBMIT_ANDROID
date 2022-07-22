package com.example.codepathpresubmit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonn = findViewById<Button>(R.id.button)
        buttonn.setOnClickListener{
            Log.v("Helloword", "Button Clicked")
            Toast.makeText(this, "Yoo Hello. How are you?", Toast.LENGTH_SHORT)

        }
    }
}