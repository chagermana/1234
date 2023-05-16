package com.example.mypartyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.Language
import java.util.*

class GraduationActivity : AppCompatActivity() {

    private lateinit var recyclerViewGrad: RecyclerView
    private lateinit var searchViewGrad: SearchView
    private var mList = ArrayList<GradData>()
    private lateinit var adapter: GradAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduation)

        recyclerViewGrad = findViewById(R.id.recyclerViewGrad)
        searchViewGrad= findViewById(R.id.searchViewGrad)

        recyclerViewGrad.setHasFixedSize(true)
        recyclerViewGrad.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = GradAdapter(mList)
        recyclerViewGrad.adapter = adapter

        searchViewGrad.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
            val filteredList = ArrayList<GradData>()
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
            GradData(
                "Booth",
                R.drawable.booths,
                "Amazing to get your pictures with a nice booth for memories.We can also have polaroid pictures taken."
            )
        )
        mList.add(
            GradData(
                "Helium balloons",
                R.drawable.helium,
                "You could attach printed images to strings with tap and display them from helium balloons."
            )
        )
        mList.add(
            GradData(
                "karaoke",
                R.drawable.karaoke,
                "Singing as loud as you can is a good idea especially because you have graduated from university."
            )
        )
        mList.add(
            GradData(
                "Partying",
                R.drawable.partying,
                "Head over to the club and jam while chugging all the alcohol you could possibly have.."
            )
        )
        mList.add(
            GradData(
                "Pop balloons",
                R.drawable.pop,
                "Blow balloons and add confetti and glitter.Once you arrive at your party just grab a pin and pop 'em."

            )
        )
        mList.add(
            GradData(
                "Cake",
                R.drawable.cake,
                "Order a graduation decorated cake and cut it."
            )
        )
        mList.add(
            GradData(
                "Guest book",
                R.drawable.guestbook,
                "As people walk into your party,have them write something.This could be great if you do not like graduation cards as in everything will be in a book."
            )
        )
        mList.add(
            GradData(
                "Confetti cones",
                R.drawable.confetti,
                "Pass out these cones to guests as they walk in the door and then have them shower the grad with confetti whenever they see them."
            )
        )
        mList.add(
            GradData(
                "Cup cakes",
                R.drawable.cupcakes,
                "Cupcakes are nice so baking different flavours would be nice for the people who are invited.  "
            )
        )
        mList.add(
            GradData(
                "Smarter?",
                R.drawable.smarter,
                "Prepare a list of academic and pop-culture questions in advance. Separate players into two teams preferably teens vs. adults. Use the questions you prepared to see which generation has the brains in the family."
            )
        )
        mList.add(
            GradData(
                "Who knows you best",
                R.drawable.best,
                "Want to see who knows your child best? Select a few contrasting categories for each player to guess which one your graduate prefers. If you know your child loves dogs, one question can be “Dogs or Cats?” The player with the most correct answers wins."
            )
        )
        mList.add(
            GradData(
                "Dumb charades",
                R.drawable.charadess,
                "For a great team game at your graduation celebration, suggest your party-goers join you for a few rounds of charades. Split your group into two teams and watch as they try and guess words or phrases being acted out. The team with the highest score wins, so encourage your teams to get creative and really go for it."
            )
        )
        mList.add(
            GradData(
                "Giant twister",
                R.drawable.gianttwister,
                " Swap the traditional mat for a supersized version, with plenty of space for everyone to join in.!"
            )
        )
        mList.add(
            GradData(
                "Guess the song",
                R.drawable.guesssong,
                "Hum or listen to a song and guess it.Everyone who doesn't guess right has to have a shot of tequila.."

            )
        )
        mList.add(
            GradData(
                "Outing ",
                R.drawable.outings,
                "."
            )
        )
        mList.add(
            GradData(
                "Chocolate box",
                R.drawable.games,
                "Similar to Red-letter where there is the talking kid and the rest of the kids.Basically, the talking kid will choose a group of anything say names of fruits,cars and tell the rest of the kids.Afterwards, the rest of the kids will choose their fruits and one of them will become the messenger kid and tell the talking kid the options from which the talking kid will pick one.As soon as the other kids hears their fruit, both the talking kid and the the other kid whose fruit was mentioned will run 4 times back and forth.Whoever reaches first will become the talking kid and the one who was slow will join the rest of the kids"
            )
        )


    }
    }
