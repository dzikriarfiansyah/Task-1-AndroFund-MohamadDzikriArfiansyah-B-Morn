package com.example.tugas

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.editTextEmail)
        etPassword = findViewById(R.id.editTextPasword)

        val bundle = intent.extras
        if (bundle != null) {
            etEmail.setText(bundle.getString("email"))
            etPassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.button_Login)
        btnLogin.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_Login -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("User", User(etEmail.text.toString(),etPassword.text.toString()))
                startActivity(intent)


            }
        }

        if (v != null){
            when(v.id){
                R.id.button_Login -> {
                    val pindahIntent = Intent(this, Branda::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}