package com.example.mypartyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BirthdayActivity : AppCompatActivity() {
    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        button1=findViewById(R.id.Btn_babies)
        button1.setOnClickListener {
            val intent=Intent(this,Menubabies::class.java)
            startActivity(intent)
        }

        button2=findViewById(R.id.Btn_teens)
        button2.setOnClickListener {
            val intent=Intent(this,Teens::class.java)
            startActivity(intent)

        }

        button3=findViewById(R.id.Btn_adults)
        button3.setOnClickListener {
            val intent=Intent(this,Adults::class.java)
            startActivity(intent)
        }


    }
}
