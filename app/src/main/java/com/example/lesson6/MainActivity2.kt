package com.example.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val login2 = findViewById<TextView>(R.id.editTextLogin2)
        val phone2 = findViewById<TextView>(R.id.editTextPhone2)

        val loginValue = intent.getStringExtra(login1)
        val phoneValue = intent.getStringExtra(phone1)
//        val passwordValue = intent.getStringExtra(password1)

        login2.text = loginValue.toString()
        phone2.text = phoneValue.toString()
    }
}