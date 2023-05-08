package com.example.mypartyapp

import android.content.res.Resources.Theme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class babies : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var themesList: ArrayList<themes>
    private lateinit var themeAdapter:themeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_babies)

        recyclerView=findViewById(R.id.recyclerviewthemes)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        themesList=ArrayList()

        themesList.add(themes(R.drawable.madagascar,"Madagascar"))
        themesList.add(themes(R.drawable.mickeymouse,"Mickey Mouse"))
        themesList.add(themes(R.drawable.sofia_the_first,"Sofia the first"))
        themesList.add(themes(R.drawable.pjmasks,"Pj Masks"))
        themesList.add(themes(R.drawable.cocomelon,"Cocomelon"))
        themesList.add(themes(R.drawable.toystorytheme1,"Toy Story"))
        themesList.add(themes(R.drawable.paw_patrol,"Paw Patrol"))
        themesList.add(themes(R.drawable.vampirina,"Vampiririna"))

        themeAdapter =themeAdapter((themesList))
        recyclerView.adapter=themeAdapter

    }
}