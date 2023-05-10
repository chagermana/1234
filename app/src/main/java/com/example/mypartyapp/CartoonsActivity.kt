package com.example.mypartyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CartoonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartoons)

        //val headingcartoons:TextView=findViewById(R.id.heading)
        val maincartoons:TextView=findViewById(R.id.cartoons)
        //val imagecartoons:ImageView=findViewById(R.id.image_heading)

        val bundle :Bundle?=intent.extras
        val heading=bundle!!.getString("heading")
        val imageId=bundle.getInt("imageId")
        val Cartoons=bundle.getString("Cartoons")

        //headingcartoons.text=heading
        maincartoons.text=Cartoons
        //imagecartoons.setImageResource(imageId)





    }
}