package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val imageViewLs1 = findViewById<ImageView>(R.id.imageViewLs1)
        imageViewLs1.load("https://lh3.googleusercontent.com/p/AF1QipNtJT0mqt2KUYCm8OPARpNLn_l_QhXU2ty7ZmIw=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewLs2 = findViewById<ImageView>(R.id.imageViewLs2)
        imageViewLs2.load("https://lh3.googleusercontent.com/p/AF1QipP0qievLEUafWZLWhRCIUalxjztfPL8lpuNqSM=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewLs3 = findViewById<ImageView>(R.id.imageViewLs3)
        imageViewLs3.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }



    }
}