package com.example.myapplication.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        actionBar?.hide()

        val entrar = findViewById<TextView>(R.id.acessar)
        val registrar = findViewById<TextView>(R.id.criar)

        entrar.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        registrar.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}