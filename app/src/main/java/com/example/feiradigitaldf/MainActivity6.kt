package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val imageViewSo1 = findViewById<ImageView>(R.id.imageViewSo1)
        imageViewSo1.load("https://lh3.googleusercontent.com/p/AF1QipPxBQosmGzfxFeCjOoixbNtlGqtcLhL06DpKqMn=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewSo2 = findViewById<ImageView>(R.id.imageViewSo2)
        imageViewSo2.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewSo3 = findViewById<ImageView>(R.id.imageViewSo3)
        imageViewSo3.load("")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }


    }
}