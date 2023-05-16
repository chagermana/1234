package com.example.mypartyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import java.util.Locale

class BabyshowerActivity : AppCompatActivity() {

    private lateinit var recyclerViewShower: RecyclerView
    private lateinit var searchViewShower: SearchView
    private var mList = ArrayList<ShowerData>()
    private lateinit var adapter: ShowerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_babyshower)

        recyclerViewShower = findViewById(R.id.recyclerViewShower)
        searchViewShower = findViewById(R.id.searchViewShower)

        recyclerViewShower.setHasFixedSize(true)
        recyclerViewShower.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = ShowerAdapter(mList)
        recyclerViewShower.adapter = adapter

        searchViewShower.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
            val filteredList = ArrayList<ShowerData>()
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
            ShowerData(
                "Guess the baby Food",
                R.drawable.babyfood,
                "Distribute paper and pens to guests, then ask them to smell each jar of puree and jot down which foods they think are inside. (If you want to make it especially tricky, have them do this blindfolded!)."
            )
        )
        mList.add(
            ShowerData(
                "Mommy or Daddy",
                R.drawable.mommy,
                "Hand out the list of questions to each guest. Once everyone has jotted down their answers, invite the mom- and dad-to-be up front, read the questions out loud and have them give their responses. Whichever guest answers the most correctly gets a prize."
            )
        )
        mList.add(
            ShowerData(
                "Balloon pop",
                R.drawable.pops,
                "Nothing feels more festive than baby shower games with balloons—especially when you’re making lots of noise. For this one, separate guests into teams and give each a balloon. When the host says “go!” the first person from each team must blow up their balloon and stick it under their shirt. Once they’re done, the second person on each team does the same, then the third, and so on. Once all team members have balloons under their shirts, the first person must pop their balloon, then the second, and third, etc. The team who blows up and pops their balloons the fastest wins."
            )
        )
        mList.add(
            ShowerData(
                "Name the tune",
                R.drawable.tune,
                "Play one children’s song at a time and keep track of who can accurately guess each song name the fastest. Whoever has the most correct responses wins."
            )
        )
        mList.add(
            ShowerData(
                "Nursery Rhyme Quiz",
                R.drawable.quiz,
                "Ask your guests to fill in the blanks. The person who completes the most correctly win."

            )
        )
        mList.add(
            ShowerData(
                "Do you know your baby items",
                R.drawable.items,
                "Each guest must write down as many baby items they know.Whoever has the most items written will be declared the winner."
            )
        )
        mList.add(
            ShowerData(
                "Brace",
                R.drawable.brace,
                "Each guest takes a bottle and drinks as fast as possible. The one who finishes first wins a prize."
            )
        )
        mList.add(
            ShowerData(
                "Tv Shows?",
                R.drawable.shows,
                "With a timer on, you have to guess the name of the show of the images you are shown.Whoever gets the most answers correct wins."
            )
        )
        mList.add(
            ShowerData(
                "Musical chairs",
                R.drawable.musicalchairs,
                "An enjoyable thing to have music playing while walking around chairs with the anxiety of the music stopping all of a sudden which means having to grab a chair.This time use baby music.  "
            )
        )
        mList.add(
            ShowerData(
                "Photo booth",
                R.drawable.photo,
                "No matter what the occasion is, a photo booth is always a fun way to save precious moments. "
            )
        )
        mList.add(
            ShowerData(
                "Gifts",
                R.drawable.gifts,
                "You could purchase necessary gifts like a washable wool throw blanket,foot bed sandal,fluffy pillows e.t.c for the mom-to-be ."
            )
        )
        mList.add(
            ShowerData(
                "Diaper Change ",
                R.drawable.diaper,
                "Using dolls as a baby,have people do a diaper change.Whoever finishes first neatly wins.What is more is you can blindfold them so that it becomes more challenging."
            )
        )
        mList.add(
            ShowerData(
                "Baby Hunt",
                R.drawable.hunt,
                "You could hide loads of baby dolls at the venue and have the guests collect as many as they can so at the end of the party, whoever has the most baby dolls wins!"
            )
        )
        mList.add(
            ShowerData(
                "Clothes decorating",
                R.drawable.clothes,
                "You could use markers or even paints to decorate a few pieces of clothing for the baby to come.This would be nice for the pregnant couple for they will get reminded of the time before the baby came into the world and how they held a party with their friends"

            )
        )



    }
    }
