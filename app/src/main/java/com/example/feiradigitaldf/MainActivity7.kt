package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val imageViewNo1 = findViewById<ImageView>(R.id.imageViewNo1)
        imageViewNo1.load("https://lh3.googleusercontent.com/p/AF1QipMAzn4AJ0FWZeaMY4FP4o3DWtPRAF8MWVVA8Mag=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewNo2 = findViewById<ImageView>(R.id.imageViewNo2)
        imageViewNo2.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewNo3 = findViewById<ImageView>(R.id.imageViewNo3)
        imageViewNo3.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }


    }
}