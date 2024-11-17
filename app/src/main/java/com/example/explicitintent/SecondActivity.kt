package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val im1=findViewById<ImageView>(R.id.imageView2)
        im1.setOnClickListener{
            val intent1=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent1)
        }

        val im2=findViewById<ImageView>(R.id.imageView3)
        im2.setOnClickListener{
            val intent2=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}