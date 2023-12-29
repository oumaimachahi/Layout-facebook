package com.example.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emaill=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password=findViewById<EditText>(R.id.editTextTextPassword)
        val btn=findViewById<Button>(R.id.button)
        val tx=findViewById<TextView>(R.id.textView)
        btn.setOnClickListener{
            val txtemail=emaill.text.toString()
            val pass=password.text.toString()
            if (txtemail.isEmpty()&& pass.isEmpty()){
                Toast.makeText(this, "entrer email et mot passe", Toast.LENGTH_SHORT).show();
            }else{

                val intent = Intent(this, MainActivity2::class.java)

                intent.putExtra("email", txtemail)
                intent.putExtra("password", pass)

                startActivity(intent)
            }




        }
        }
    }