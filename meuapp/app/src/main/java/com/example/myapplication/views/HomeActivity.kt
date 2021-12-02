package com.example.myapplication.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.myapplication.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logout = findViewById<ImageButton>(R.id.btnExit)

        logout.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}