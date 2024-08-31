package com.restilatihan4

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var forgotPassword: TextView
    private lateinit var signUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        forgotPassword = findViewById(R.id.forgotPassword)
        signUp = findViewById(R.id.signUp)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        forgotPassword.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_forgot_password::class.java)
            startActivity(intent)
        }

        signUp.setOnClickListener {
            val intent2 = Intent(this@MainActivity, Activity_sign::class.java)
            startActivity(intent2)
        }
    }
}
