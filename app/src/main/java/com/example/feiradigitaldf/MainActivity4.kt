package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val imageViewS1 = findViewById<ImageView>(R.id.imageViewS1)
        imageViewS1.load("https://lh3.googleusercontent.com/p/AF1QipMQ9GJ61FvzNW6XcKm2T7OFnuBvc4JKV-Wz6D8c=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewS2 = findViewById<ImageView>(R.id.imageViewS2)
        imageViewS2.load("https://lh3.googleusercontent.com/p/AF1QipPb38qzOnF6mdgn1HYUYWAN52iIniYb93MBgfx0=s680-w680-h510")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }

        val imageViewS3 = findViewById<ImageView>(R.id.imageViewS3)
        imageViewS3.load("https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=6l3_G2hf5u9_SOvaHDOY-g&cb_client=search.gws-prod.gps&yaw=346.82678&pitch=0&thumbfov=100&w=520&h=175")
        {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)
        }



    }
}

