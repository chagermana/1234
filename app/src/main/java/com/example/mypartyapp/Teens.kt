package com.example.mypartyapp



import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.Language
import java.util.*

class Teens: AppCompatActivity() {

    private lateinit var recyclerViewTeens: RecyclerView
    private lateinit var searchViewTeens: SearchView
    private var mList = ArrayList<TeenData>()
    private lateinit var adapter: TeenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teens)

        recyclerViewTeens = findViewById(R.id.recyclerViewTeens)
        searchViewTeens = findViewById(R.id.searchViewTeens)

        recyclerViewTeens.setHasFixedSize(true)
        recyclerViewTeens.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = TeenAdapter(mList)
        recyclerViewTeens.adapter = adapter

        searchViewTeens.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
            val filteredList = ArrayList<TeenData>()
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
            TeenData(
                "Egg Toss",
                R.drawable.eggtoss,
                "This is an activity that you would rather take outside.Pair up players and have toss the egg back and forth to each other.Each time they catch it, they have to take a step backwards and continue.The team with the longest distance wins."
            )
        )
        mList.add(
            TeenData(
                "Three sticks",
                R.drawable.threesticks,
                "Requires the teens to really jump.So the teens have to find 3 sticks.They basically arrange the sticks a certain small distance apart.The teens ony have 3 steps to make to get across without touching the sticks.After each teen has done the round,the distance between the sticks increases.It reaches a point where the teens would have to run."
            )
        )
        mList.add(
            TeenData(
                "It",
                R.drawable.it,
                "One player is chosen to be ‘It.’ It chases the other players and when he/she tags a player, that person must freeze and remain frozen until another untagged player tags them to unfreeze them, they then may re-join the game. The game is played until all players have been frozen and then a new It is chosen for the next round.\n" +
                        "\n" +
                        "To make the game even more fun, when unfreezing a tagged player you must call out the name of a television show. If you call the name of a show that has already been used, both you and the frozen player are now frozen together and must remain frozen until another player is free to rescue you!."
            )
        )
        mList.add(
            TeenData(
                "Quicksand",
                R.drawable.quicksand,
                "Messy but fun to play with.A type of sand that acts like both solid and liquid."
            )
        )
        mList.add(
            TeenData(
                "Kinetic sand",
                R.drawable.kineticsand,
                "A satisfying type of sand that stays together,allowing you to easily mold and create shapes.A fun thing to play with."

            )
        )
        mList.add(
            TeenData(
                "Spa",
                R.drawable.spa,
                "Relaxing spa sounds good where face masks,foot spas, nail polish,hair spa and many more can happen."
            )
        )
        mList.add(
            TeenData(
                "Water party",
                R.drawable.party,
                "Either waterguns or water balloons to be the thing to use for the fun party."
            )
        )
        mList.add(
            TeenData(
                "Paintballing",
                R.drawable.paintballing,
                "This is good for 17 and 16 year olds."
            )
        )
        mList.add(
            TeenData(
                "Musical chairs",
                R.drawable.musicalchairs,
                "An enjoyabble thing to have music playin while walking around chairs with the anxiety of the music stopping all of a sudden which means having to grab a chair.  "
            )
        )
        mList.add(
            TeenData(
                "Picnic",
                R.drawable.picnic,
                "Plan an outside picnic, maybe in the park, and invite all the guests to decide the menu and prepare it. "
            )
        )
        mList.add(
            TeenData(
                "Rock climbing",
                R.drawable.rockclimbing,
                "Sounds great.You could take them to the natural type of rock climbing or the ones usually at the malls."
            )
        )
        mList.add(
            TeenData(
                "Horse riding",
                R.drawable.horseriding,
                "You could call the horsekeeper to your place or go to a place where these rides are given."
            )
        )
        mList.add(
            TeenData(
                "Camel riding",
                R.drawable.camelriding,
                "Another fun ride on the camels hump!"
            )
        )
        mList.add(
            TeenData(
                "Swimming",
                R.drawable.swimming ,
                "Home or out,whichever, swimming is fun.Going out would mean slides so that's fun."

            )
        )
        mList.add(
            TeenData(
                "rollercoaster",
                R.drawable.rollercoaster,
                "So many types of rides.A great way to have some fun."
            )
        )
        mList.add(
            TeenData(
                "Movies",
                R.drawable.games,
                "It is always a great idea no matter what age.They could have the movie night at home outside in the backyard or in the living room.You only need to make it super cozy with loads of snacks especially popcorn and blankets.The other option is going to the cinemas."
            )
        )
        mList.add(
            TeenData(
                "Video games",
                R.drawable.videogames,
                "Whether motor racing,football,golf or shooting, it's always fun to play these games. "
            )
        )
        mList.add(
            TeenData(
                "VR",
                R.drawable.vr,
                "Virtual reality is a simulated 3D environment that enables users to explore and interact with a virtual surrounding in a way that approximates reality, as it is perceived through the users' senses.So playing games like this would be absolute fun."

            )
        )
        mList.add(
            TeenData(
                "Bowling",
                R.drawable.bowling,
                "."
            )
        )
        mList.add(
            TeenData(
                "Truth or dare",
                R.drawable.truthordare,
                "You spin a bottle and them whoever the mouth of the bottle faces is asked whether they want a truth or a dare.."

            )
        )
        mList.add(
            TeenData(
                "Frisbee Toss",
                R.drawable.frisbee,
                "Hone your frisbee throwing skills. Grab a bucket or laundry basket, and have each birthday guest try to toss the frisbee in from varying lengths across the yard."
            )
        )
        mList.add(
            TeenData(
                "Escape room kit",
                R.drawable.escaperoomkit,
                "They have to solve a variety of puzzles in order to escape.It is like an escape room."
            )
        )
        mList.add(
            TeenData(
                "Uno",
                R.drawable.uno,
                "This is a fun card game that you can purchase and have loads of fun with."
            )
        )
        mList.add(
            TeenData(
                "Never Have I Ever",
                R.drawable.never,
                "This is one of the most popular teen party games and it uses no supplies! Players must use the line: \"never have I ever ______\" and state something they have never experienced. Those who have also never experienced it, earn a point.."
            )
        )
        mList.add(
            TeenData(
                "Dark room",
                R.drawable.room,
                "A fun indoor game.All you have to do is to pick a spot in the house like room while its dark and play hide and seek.The seeker wil switch of the lights while the rest will hide then switch on the light and find the kids hiding. "
            )
        )
        mList.add(
            TeenData(
                "Two truths and a lie",
                R.drawable.lie,
                "A fun teen game of trying to get others to believe your lie. You tell a group 3 different things about you; however, one of them must be a lie. Others try to guess the lie."
            )
        )
        mList.add(
            TeenData(
                "Chits",
                R.drawable.chits,
                "Write anything in small pieces of paper and then fold them and put them in a jar.Everyone pick a chit and does or reads whatever is written in the chits."

            )
        )
        mList.add(
            TeenData(
                "Guess the song",
                R.drawable.song,
                "You make the group listen to songs where they guess which song it is and this makes them earn points."
            )
        )
        mList.add(
            TeenData(
                "Social media",
                R.drawable.socialmedia,
                "Yep that's the in the in right now so you could have them do loads of trends and have them post them on their social media accounts."
            )
        )
        mList.add(
            TeenData(
                "Photo booth",
                R.drawable.booth,
                "Depending on what your teen likes you could get a booth and im pretty sure if your kid is photogenic, they will have a blast taking pictures."
            )
        )
        mList.add(
            TeenData(
                "Museum",
                R.drawable.museum,
                "Plan a sleepover party for your girls with a customized tepee and some midnight snacks and eye masks. "
            )
        )
        mList.add(
            TeenData(
                "Fashion show",
                R.drawable.fashionshow,
                "Wonderful memories where your teen is walking the runway.It could be a silly runway walk or a serious one. "
            )
        )
        mList.add(
            TeenData(
                "Zumba",
                R.drawable.zumba,
                "All you need is music and a zumba teacher.The tweens would really enjoy this."
            )
        )
        mList.add(
            TeenData(
                "Designing shirts",
                R.drawable.shirt,
                "You would require an instructor to help the teens deign their shirts.The teens could paint them and let them dry while they do other activities."

            )
        )
        mList.add(
            TeenData(
                "Table tennis",
                R.drawable.tennis,
                "This would be fun especially for a sporty kind off teen"
            )
        )

    }
}