package com.example.tugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity_Akun : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val btnAkun = findViewById<Button>(R.id.buat_akun)
        btnAkun.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.buat_akun -> {
                val intent = Intent(this@Activity_Akun, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}