package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val imageViewNo1 = findViewById<ImageView>(R.id.imageViewNo1)
        imageViewNo1.load("https://lh3.googleusercontent.com/p/AF1QipPTk58vY7tEgg_URMZWPn5jLLPo5QqpqbfL7irS=s680-w680-h510")
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