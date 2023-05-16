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
        list.add(Models("Harry Potter", description = "",R.drawable.harrypotter))
        list.add(Models("Doc Mcstuffins", description = "",R.drawable.docmacstuffines))
        list.add(Models("Adventure time", description = "",R.drawable.adventuretime))
        list.add(Models("Dora the explorer", description = "",R.drawable.dora))
        list.add(Models("Phineus and Ferb", description = "",R.drawable.phineus))
        list.add(Models("Spongebob", description = "",R.drawable.spongebob))
        list.add(Models("Little Mermaid", description = "",R.drawable.littlemermaid))
        list.add(Models("Tom and Jerry", description = "",R.drawable.tomandjerry))
        list.add(Models("Scooby Doo", description = "",R.drawable.scooby))
        list.add(Models("Power Puff Girls", description = "",R.drawable.powerpuff))
        list.add(Models("Minions", description = "",R.drawable.minions))
        list.add(Models("Mr Bean", description = "",R.drawable.bean))
        list.add(Models("Teen Titans", description = "",R.drawable.teentitans))
        list.add(Models("I am Groot", description = "",R.drawable.iamgroot))
        list.add(Models("Smurfs", description = "",R.drawable.smurfs))
        list.add(Models("The Willoughbys ", description = "",R.drawable.willoubyhs))
        list.add(Models("Over the moon", description = "",R.drawable.overthemoon))
        list.add(Models("Encanto", description = "",R.drawable.encanto))
        list.add(Models("Tangled", description = "",R.drawable.tangled))
        list.add(Models("The Croods", description = "",R.drawable.thecroods))
        list.add(Models("Canvas", description = "",R.drawable.canvas))
        list.add(Models("Boss Baby", description = "",R.drawable.bossbaby))
        list.add(Models("Masha and the Bear", description = "",R.drawable.mashaandthebear))
        list.add(Models("Kung Fu Panda", description = "",R.drawable.kungfupanda))
        list.add(Models("Avatar", description = "",R.drawable.avatar))
        list.add(Models("Sing", description = "",R.drawable.sing))
        list.add(Models("Hotel Transylvania", description = "",R.drawable.hoteltransalva))
        list.add(Models("Back to the Outback", description = "",R.drawable.backtotheoutback))
        list.add(Models("The Emoji Movie", description = "",R.drawable.emojimovie))
        list.add(Models("Turbo", description = "",R.drawable.turbo))
        list.add(Models("Secret Magic Control Agency", description = "",R.drawable.backtotheoutback))
        list.add(Models("Home", description = "",R.drawable.home))
        list.add(Models("Megamind", description = "",R.drawable.megamind))
        list.add(Models("Beauty and the Beast", description = "",R.drawable.beauty))
        list.add(Models("Cars", description = "",R.drawable.cars))
        list.add(Models("Tinkerbell", description = "",R.drawable.tinkerbell))

        
         
        listView.adapter=MyAdapter1(this,R.layout.row,list)
    }
}