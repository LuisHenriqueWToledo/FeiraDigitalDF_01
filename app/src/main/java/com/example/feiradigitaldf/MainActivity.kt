package com.example.feiradigitaldf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import kotlinx.coroutines.delay
import android.content.Intent
import android.os.Handler


private infix fun Unit.finish(unit: Unit) {

}
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        //splash screen
            supportActionBar?.hide()

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent (this@MainActivity,MainActivity2::class.java)
                startActivity(intent)}, 4500)
        }

    }
