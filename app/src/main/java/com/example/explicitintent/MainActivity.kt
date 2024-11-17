package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnIntent=findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener{
            //open a new activity
            //explicit intent

            intent= Intent(applicationContext, SecondActivity::class.java)//SecondActivity=name of the to be opened activity
            //class.java=syntax, not language used
            startActivity(intent) // pass intent in startActivity
            //used for buttons, image or anything!
        }

    }
}