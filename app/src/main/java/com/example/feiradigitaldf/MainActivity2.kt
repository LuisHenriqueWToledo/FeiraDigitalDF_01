package com.example.feiradigitaldf

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.feiradigitaldf.R.drawable.ic_launcher_background


class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // busca imagem na internet - dependencies ok no gradle e permission ok no manifest

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.load("https://live.staticflickr.com/65535/53191130317_5123baf88a_z.jpg")
        {
            crossfade(true)
            placeholder(ic_launcher_background)
        }


        // tela de escolha da regiao

        val btSegundaTela01 = findViewById<Button>(R.id.button)
        btSegundaTela01.setOnClickListener {
            segueRegiao01()
        }

        val btSegundaTela02 = findViewById<Button>(R.id.button2)
        btSegundaTela02.setOnClickListener {
            segueRegiao02()
        }

        val btSegundaTela03 = findViewById<Button>(R.id.button3)
        btSegundaTela02.setOnClickListener {
            segueRegiao03()
        }
        val btSegundaTela04 = findViewById<Button>(R.id.button4)
        btSegundaTela02.setOnClickListener {
            segueRegiao04()
        }
        val btSegundaTela05 = findViewById<Button>(R.id.button5)
        btSegundaTela02.setOnClickListener {
            segueRegiao05()
        }
        val btSegundaTela06 = findViewById<Button>(R.id.button6)
        btSegundaTela02.setOnClickListener {
            segueRegiao06()
        }
    }

private fun segueRegiao01 () {
    val seguir01 = Intent(this, MainActivity3::class.java)
    startActivity(seguir01)
}

private fun segueRegiao02() {
    val seguir02 = Intent(this, MainActivity4::class.java)
    startActivity(seguir02)

}
private fun segueRegiao03() {
    val seguir03 = Intent(this, MainActivity5::class.java)
    startActivity(seguir03)
}
private fun segueRegiao04() {
    val seguir04 = Intent(this, MainActivity6::class.java)
    startActivity(seguir04)
}
private fun segueRegiao05() {
    val seguir05 = Intent(this, MainActivity7::class.java)
    startActivity(seguir05)
}

private fun segueRegiao06() {
    val seguir06 = Intent(this, MainActivity8::class.java)
    startActivity(seguir06)
}