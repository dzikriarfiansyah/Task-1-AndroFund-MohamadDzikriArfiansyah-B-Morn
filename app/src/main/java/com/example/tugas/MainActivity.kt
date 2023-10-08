package com.example.tugas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnback: Button = findViewById(R.id.btn_back)
        btnback.setOnClickListener(this)

    }


    override fun onClick(v: View) {

        if (v != null){
            when(v.id){
                R.id.btn_back -> {
                    val pindahIntent = Intent(this, LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}