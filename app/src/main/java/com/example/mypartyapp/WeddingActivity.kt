package com.example.mypartyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.Language
import java.util.*

class WeddingActivity : AppCompatActivity() {

    private lateinit var recyclerViewWed: RecyclerView
    private lateinit var searchViewWed: SearchView
    private var mList = ArrayList<WedData>()
    private lateinit var adapter: WedAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedding)

        recyclerViewWed = findViewById(R.id.recyclerViewWed)
        searchViewWed = findViewById(R.id.searchViewWed)

        recyclerViewWed.setHasFixedSize(true)
        recyclerViewWed.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = WedAdapter(mList)
        recyclerViewWed.adapter = adapter

        searchViewWed.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
            val filteredList = ArrayList<WedData>()
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
            WedData(
                "Themed",
                R.drawable.themed,
                "Pick a theme, whether indian,african for the guests ."
            )
        )
        mList.add(
            WedData(
                "Jenga",
                R.drawable.jenga,
                "You could have it set up at the entrance so like whenever a guest arrives at your party, they have to move a piece.You could choose for your jenga pieces to have stuff written on them to be done and whatever it is should be linked to the wedding."
            )
        )
        mList.add(
            WedData(
                "Pinata",
                R.drawable.kke,
                "Who does not like pinatas.Inside it there can be candy,chocolate or even pieces of papers with dares or cocktail mixes"
            )
        )
        mList.add(
            WedData(
                "x and o",
                R.drawable.xo,
                "YOu could set up whiteboards at random place and have your guests play.To spice it up, have a some cards with dares written on them near the board ."
            )
        )
        mList.add(
            WedData(
                "Photo booth",
                R.drawable.maghow,
                "You could use polaroid cameras and then hang the polaroids on a board.You could set it up at the entrance so that everyone can see.The bride and groom could place the board in their home.  ."

            )
        )
        mList.add(
            WedData(
                "Guest book",
                R.drawable.pa,
                "Have a little book at every table or at the entrance.The guests could write a little something for ya."
            )
        )
        mList.add(
            WedData(
                "Shoe game",
                R.drawable.hoho,
                "Set up two chairs back to back, and seat the bride and groom down together.The point of the game is that they don’t see each other’s answers. For this game, the bride will be using her own shoes, and her partner’s shoes.Have them take off both of their shoes and hand one to the other. They should each be holding one of the bride’s shoes and one of the groom’s. These shoes will represent each other. Someone will read a series of questions, and if the answer is the groom, she will hold up the groom’s shoe. If the answer is the bride, she will raise her own shoe ."
            )
        )
        mList.add(
            WedData(
                "Hide the shoe",
                R.drawable.shoe,
                "This is inspiration from indian weddings.The girls side has to try and steal the grooms shoes.If the shoes do get stolen then the groom has to think of a way of bribing the girls side into releasing his shoes"
            )
        )
        mList.add(
            WedData(
                "Musical chairs",
                R.drawable.musicalchairs,
                "An enjoyable thing to have music playing while walking around chairs with the anxiety of the music stopping all of a sudden which means having to grab a chair.  "
            )
        )
        mList.add(
            WedData(
                "Kids area",
                R.drawable.area,
                "This is an absolutely cool idea where kids ar involved.You can have an area set aside for kids to play and also have their own food like chips, chicken nuggets e.t.c.This way the kids will be occupied and parents can enjoy the day "
            )
        )
        mList.add(
            WedData(
                "Darts",
                R.drawable.darts,
                "a dart art station is a fun daytime wedding reception activity."
            )
        )
        mList.add(
            WedData(
                "Bar station",
                R.drawable.bars,
                "If in case you have dares that include mixing your own drinks then a bar station would be required.In case you make too much, you could put an extra jar at the station to be filled and name give it a name. "
            )
        )
        mList.add(
            WedData(
                "Poker station",
                R.drawable.hideanseek,
                "Give your guests the perfect excuse to take a break from all that dancing and play a game or two of poker!"
            )
        )
        mList.add(
            WedData(
                "Different cuisines",
                R.drawable.cuic,
                "The food station could have varieties and varieties of cuisines.This is great for the guests that love eating."

            )
        )
        mList.add(
            WedData(
                "Sheesha corner",
                R.drawable.she,
                "Have a corner where people can comfortably sit and do sheesha."
            )
        )
        mList.add(
            WedData(
                "Whiskey and cigar corner",
                R.drawable.gameps,
                "Similar to sheesha corner, have a whiskey and cigar corner.Also, you could have some whiskey tasting occur."
            )
        )
        mList.add(
            WedData(
                "Performances",
                R.drawable.md,
                "Pre plan this with the guests.You could have the bride and the groom perform a little surprise something so that everybody will be entertained.You could have kids or the guests perform. "
            )
        )
        mList.add(
            WedData(
                "Mini-golf",
                R.drawable.golf,
                "For all the golfers out there, this would be fun.The bride and groom could have pictures taken while they are at it."

            )
        )
        mList.add(
            WedData(
                "Archery corner",
                R.drawable.lonn,
                "Just like any other activity during a wedding,you could have archery happen.."
            )
        )

    }
}