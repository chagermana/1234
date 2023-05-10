package com.example.mypartyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class NewBabies : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_babies)

        var listView=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Models>()

        list.add(Models("Sofia the first", description = "",R.drawable.sofia_the_first))
        list.add(Models("Vampirina",description="",R.drawable.vampirina))
        list.add(Models("Paw Patrol", description = "",R.drawable.paw_patrol))
        list.add(Models("Madagascar", description = "",R.drawable.madagascar))
        list.add(Models("Mickey Mouse", description = "",R.drawable.mickeymouse))
        list.add(Models("Pjmasks", description = "",R.drawable.pjmasks))
        list.add(Models("Frozen", description = "",R.drawable.frozen))
        list.add(Models("Batman", description = "",R.drawable.batman))
        list.add(Models("Wonderwoman", description = "",R.drawable.wonderwoman))
        list.add(Models("Spiderman", description = "",R.drawable.spiderman))
        list.add(Models("Moana", description = "",R.drawable.moana))
        list.add(Models("Finding Nemo", description = "",R.drawable.findingnemo))
        list.add(Models("Dungeons and dragons", description = "",R.drawable.dungeons))
        list.add(Models("Alvin and the Chipmunks", description = "",R.drawable.alvinandthechipmunks))
        list.add(Models("Peppa Pig", description = "",R.drawable.peppapig))





        listView.adapter=MyAdapter1(this,R.layout.row,list)
    }
}