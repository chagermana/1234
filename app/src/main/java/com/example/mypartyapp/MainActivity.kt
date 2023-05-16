package com.example.mypartyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img_babyshower=findViewById<ImageView>(R.id.img_babyshower)
        img_babyshower.setOnClickListener{
            val intent=Intent(this,BabyshowerActivity::class.java)
            startActivity(intent)
        }

        val img_birthday=findViewById<ImageView>(R.id.img_birthday)
        img_birthday.setOnClickListener{
            val intent=Intent(this,BirthdayActivity::class.java)
            startActivity(intent)
        }

        val img_graduation=findViewById<ImageView>(R.id.img_graduation)
        img_graduation.setOnClickListener{
            val intent=Intent(this,GraduationActivity::class.java)
            startActivity(intent)
        }

        val img_wedding=findViewById<ImageView>(R.id.img_wedding)
        img_wedding.setOnClickListener{
            val intent=Intent(this,WeddingActivity::class.java)
            startActivity(intent)
        }





    }
}