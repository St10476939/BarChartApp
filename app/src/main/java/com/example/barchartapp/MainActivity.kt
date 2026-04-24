package com.example.barchartapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtArt = findViewById<EditText>(R.id.edtArt)
        val edtBob = findViewById<EditText>(R.id.edtBob)
        val edtCal = findViewById<EditText>(R.id.edtCal)
        val edtDan = findViewById<EditText>(R.id.edtDan)
        val edtEli = findViewById<EditText>(R.id.edtEli)

        val txtDisplay = findViewById<TextView>(R.id.txtDisplay)
        val btnResult = findViewById<Button>(R.id.btnResults)

        btnResult.setOnClickListener{
            val art = edtArt.text.toString().toIntOrNull() ?: 0
            val bob = edtBob.text.toString().toIntOrNull() ?: 0
            val cal = edtCal.text.toString().toIntOrNull() ?: 0
            val dan = edtDan.text.toString().toIntOrNull() ?: 0
            val eli = edtEli.text.toString().toIntOrNull() ?: 0

            val output = StringBuilder()

            output.append("Points for Game\n\n")
            output.append("Art  ${"*".repeat(art)}")
            output.append("Bob  ${"*".repeat(bob)}")
            output.append("Cal  ${"*".repeat(cal)}")
            output.append("Dan  ${"*".repeat(dan)}")
            output.append("Eli  ${"*".repeat(eli)}")

            txtDisplay.text = output.toString()
        }
















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}