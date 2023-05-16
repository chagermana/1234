package com.example.mypartyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menubabies : AppCompatActivity() {

    lateinit var themesbabies:Button
    lateinit var activitiesbabies:Button
    lateinit var foodbabies:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menubabies)

        themesbabies=findViewById(R.id.Btn_themes)
        themesbabies.setOnClickListener {
            val intent= Intent(this,NewBabies::class.java)
            startActivity(intent)
        }

        activitiesbabies=findViewById(R.id.Btn_activities)
        activitiesbabies.setOnClickListener {
            val intent= Intent(this,ActivitiesBabies::class.java)
            startActivity(intent)
        }

        foodbabies=findViewById(R.id.Btn_food)
        foodbabies.setOnClickListener {
            val intent= Intent(this,FoodBabies::class.java)
            startActivity(intent)
        }

    }
}