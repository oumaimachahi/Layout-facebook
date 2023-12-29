package com.example.facebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val email=findViewById<TextView>(R.id.textView2)
        val pass=findViewById<TextView>(R.id.textView3)

        val usem=intent.getStringExtra("email")
        val passw=intent.getStringExtra("password")

        email.setText(usem)
        pass.setText(passw)
    }
}