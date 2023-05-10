package com.example.mypartyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ActivitiesBabies: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_babies)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })
    }

    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<LanguageData>()
            for (i in mList) {
                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        mList.add(
            LanguageData(
                "Treasure Hunt",
                R.drawable.treasurehunt,
                "Using your birthday party theme, you could make the treasure hunt match e.g if its Dungeons and Dragons, the map could be based on that.Maybe combine with pinata where they have to collectively hit the pinata to get the next clue"
            )
        )
        mList.add(
            LanguageData(
                "Tie-Dye Party",
                R.drawable.tiedye,
                "A tie-dye party is a great way to throw a bright and colorful birthday party. And the kids will have an automatic party favor to take home and wear for years to come.."
            )
        )
        mList.add(
            LanguageData(
                "karaoke",
                R.drawable.karaoke,
                "Fire up the karaoke machine and let the kids be silly! This pairs well with a glow stick dance party, movie night, and sleepover or undernight.."
            )
        )
        mList.add(
            LanguageData(
                "Glow stick dance party",
                R.drawable.glowstick,
                "Letting loose and dancing up a storm. Give everyone a set glow sticks, turn out the lights, and put on their favorite music!Sure would make them laugh."
            )
        )
        mList.add(
            LanguageData(
                "Magic Show",
                R.drawable.magicshow,
                "Magic shows will make the day very enjoyable after all who doesn't like magic."

            )
        )
        mList.add(
            LanguageData(
                "Pinata",
                R.drawable.pinata,
                "Kids will enjoy putting blindfolds on and trying to break it open so that all the candy will fall out!OOH who doesn't want candy."
            )
        )
        mList.add(
            LanguageData(
                "Movie Night",
                R.drawable.movienight,
                "Movies would be splendid.his can be part of a sleepover or an “undernight” (when the kids get picked up before bedtime).\n" +
                        "\n" +
                        "To make it memorable, have everyone lay out their sleeping bags or blankets, pop some popcorn (you can add candy like gummy bears to the popcorn to make it even more special), and turn out all the lights! This is an especially great option for a small group.\n" +
                        "\n" +
                        "Variation: Outdoor Movie Night! Snuggle up on an outdoor blanket and watch a movie outside."
            )
        )
        mList.add(
            LanguageData(
                "Watergun fight",
                R.drawable.watergun,
                "That is super fun.Just have the kids grab their own guns from their respective homes or supply them incase you have them or even buy for it shall be worth it!Another awesome idea would be waterballoons which are cheaper as compared to the guns"
            )
        )
    }
}