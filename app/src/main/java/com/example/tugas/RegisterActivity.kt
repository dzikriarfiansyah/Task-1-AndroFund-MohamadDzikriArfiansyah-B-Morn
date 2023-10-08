package com.example.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText
    private lateinit var etConfirmPasword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.create_name2)
        etEmail = findViewById(R.id.create_email2)
        etPassword = findViewById(R.id.create_password2)
        etConfirmPasword = findViewById(R.id.create_confirm2)

        val btnRegiter: Button = findViewById(R.id.buttent_register)
        btnRegiter.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.buttent_register -> {

                val bundle = Bundle()
                bundle.putString("email",etEmail.text.toString())
                bundle.putString("password",etPassword.text.toString())

                val intent = Intent(this@RegisterActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}