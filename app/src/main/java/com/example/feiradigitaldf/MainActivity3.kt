package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val imageViewN1 = findViewById<ImageView>(R.id.imageViewN1)
        imageViewN1.load("https://lh3.googleusercontent.com/p/AF1QipObirqQq0tuKtzkCe1y0PozmB39McUSIsfLc4BF=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewN2 = findViewById<ImageView>(R.id.imageViewN2)
        imageViewN2.load("https://lh3.googleusercontent.com/p/AF1QipMLhSkz4X8NFu25GYi3SAkYabKsNKBIsHbnDf88=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewN3 = findViewById<ImageView>(R.id.imageViewN3)
        imageViewN3.load("https://lh3.googleusercontent.com/p/AF1QipMe8POUFjnKStKftSDhQmqKkimECudQ2qaGCTrs=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewN4 = findViewById<ImageView>(R.id.imageViewN4)
        imageViewN4.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewN5 = findViewById<ImageView>(R.id.imageViewN5)
        imageViewN5.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }





    }
}