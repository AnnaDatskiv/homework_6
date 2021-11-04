package com.example.lesson6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.lesson6.databinding.ActivityMainBinding

const val login1="login"
const val password1 = "password"
const val phone1="phone"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<EditText>(R.id.editTextLogin)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val phone = findViewById<EditText>(R.id.editTextPhone)


        findViewById<Button>(R.id.enter).setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra(login1, login.text.toString())
            intent.putExtra(password1, password.text.toString())
            intent.putExtra(phone1, phone.text.toString())
            startActivity(intent)
        }
    }
}