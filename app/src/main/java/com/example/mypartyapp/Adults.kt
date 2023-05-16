package com.example.mypartyapp


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class Adults : AppCompatActivity() {

    private lateinit var recyclerViewAdults: RecyclerView
    private lateinit var searchViewAdults: SearchView
    private var mList = ArrayList<AdultsData>()
    private lateinit var adapter: AdultsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adults)

        recyclerViewAdults = findViewById(R.id.recyclerViewAdults)
        searchViewAdults = findViewById(R.id.searchViewAdults)

        recyclerViewAdults.setHasFixedSize(true)
        recyclerViewAdults.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = AdultsAdapter(mList)
        recyclerViewAdults.adapter = adapter

        searchViewAdults.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
            val filteredList = ArrayList<AdultsData>()
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
            AdultsData(
                "Cards against Humanity ",
                R.drawable.cardsagainsthumanity,
                "."
            )
        )
        mList.add(
            AdultsData(
                "Rummy",
                R.drawable.cards,
                "An incredible game with the standard 52-card deck.Each player gets 11 cards.What you have to do is create 3 sets.One of the sets MUST be 5 cards following each other of the same shape, second set should be 3 cards of the same number and the last set could be 3 cards with the same number or 3 cards with a mini running regardless of the shape. "
            )
        )
        mList.add(
            AdultsData(
                "Beer Pong",
                R.drawable.pong,
                "Another absolute classic. Beer Pong involves attempting to throw a ping pong ball into your opposition's cup, resulting in them drinking the contents. At either ends of a kitchen table / counter top/ ping pong table, put six cups in a triangle shape. In teams, take it in turns to throw the ball into your opposition's cups from your end, being sure to be transparent with your rules from the beginning. Is the ball allowed to bounce? Are you allowed to hit the rim? The winning team is the one who lands the ball in all of the opposition's cups before they do it to you.."
            )
        )
        mList.add(
            AdultsData(
                "Animal Kingdom",
                R.drawable.animalkingdom,
                "Every one is given a paper.All you have to do is make 5 columns.Name the columns as follows:name,car,food/drink,series/movie,country and total.So you all just pick a letter and begin."
            )
        )
        mList.add(
            AdultsData(
                "Name the song",
                R.drawable.songs,
                "One person hums a song while the rest guess it.To take it up a notch and turn it into a more 'adult' version, you can turn it into a drinking game. So, whoever guesses the song first doesn't have to drink, but the losers do. It can become very competitive, very quickly!Also you could play the song and the gys after to guess"

            )
        )
        mList.add(
            AdultsData(
                "Bowling",
                R.drawable.bowlings,
                "We all know how to play the game but here is what you could do, if you don't get above a certain score which you all agree on every round,you have to have a drink or make it tequila shots ."
            )
        )
        mList.add(
            AdultsData(
                "Mini golfing",
                R.drawable.minigolfing,
                "You could do a glow in the dark kinda mini golfing.If you hit the ball such that it goes off the required are, you have to have a shot"
            )
        )
        mList.add(
            AdultsData(
                "Bar",
                R.drawable.bar,
                "Have a themed party and head to the bar and drink."
            )
        )
        mList.add(
            AdultsData(
                "Pool",
                R.drawable.pool,
                "."
            )
        )
        mList.add(
            AdultsData(
                "Truth or dare",
                R.drawable.dare,
                "You could also do truth or drink. "
            )
        )
        mList.add(
            AdultsData(
                "Strip poker",
                R.drawable.poker,
                "With that said, it is essential to play with people you feel comfortable around. A group of close friends or your partner make great candidates. But, if playing with a group of strangers at a party works for you, then go right ahead.."
            )
        )
        mList.add(
            AdultsData(
                "Giant Jenga",
                R.drawable.jengas,
                "Always a fun game to play.Take this adult party game to the next level by writing truth or dare or drinking challenges on each Jenga piece. Whenever a player pulls out a piece, they’ve got to do the challenge written!"
            )
        )
        mList.add(
            AdultsData(
                "Monopoly",
                R.drawable.monopoly,
                "!"
            )
        )
        mList.add(
            AdultsData(
                "Donkey",
                R.drawable.donkey,
                "Using a standard 52-deck card,each player is giver 6 cards and all they have to do is make their cards of the same shape.All their 6 cards have to be of the same shape.If a player looses once they are called 'D',if they loose twice they are called 'DO', if they loose thrice they are called 'DON', if they loose four times they are called 'DONK' like that till they become 'DONKEY!'"
            )
        )
        mList.add(
            AdultsData(
                "Hiking",
                 R.drawable.hiking,
                "During the hike,you could make teams and each team is given a balloon which they will have to blow at the start of the hike.The challenge will be that whichever team ends the hike with the most balloons wins."
            )
        )
        mList.add(
            AdultsData(
                "Never Have I Ever",
                R.drawable.ever,
                "You can never be too old to play a round of Never Have I Ever. Gather your guests to play a few rounds to end the night. You’ll feel nostalgic the moment the words “Never have I…” escape your lips. If your group needs some inspiration, create DIY topic cards for endless fun."
            )
        )
        mList.add(
            AdultsData(
                "Charades",
                R.drawable.charadess,
                "This is a classic adult party game, and there’s no need to purchase anything to join in the fun! Form your teams and allow the first player to come up with a movie, song, book, celebrity or any other topic. Players act out the topic with clues, but without any words. It’s a blast to see what other team members come up with as they yell out their guesses hoping to nail the correct answer!"
            )
        )
        mList.add(
            AdultsData(
                "Karaoke",
                R.drawable.karaokes,
                "Bring on the ABBA songs. Belt out your favorite tunes in a karaoke competition among your friends. Play it American Idol-style and assign a panel of judges to determine who wins the grand prize. No matter who wins or loses, you’re sure to have a ball with this one."

            )
        )
        mList.add(
            AdultsData(
                "What do you meme",
                R.drawable.meme,
                "If you’re a Cards Against Humanity fan, you’ll love What Do You Meme. Players’ meme skills will be put to the test as they attempt to create the funniest meme at the table. It’ll be hard not to laugh when reading the cards aloud.."
            )
        )
        mList.add(
            AdultsData(
                "Birthday destination",
                R.drawable.destination,
                "You could go for a holiday and celebrate your birthday ."

            )
        )
        mList.add(
            AdultsData(
                "Kayaking",
                R.drawable.kayaking,
                "Hone your frisbee throwing skills. Grab a bucket or laundry basket, and have each birthday guest try to toss the frisbee in from varying lengths across the yard."
            )
        )
        mList.add(
            AdultsData(
                "Wine tasting",
                R.drawable.wine,
                "Go grab the ladder from the garage and place a bottle on the bottom rung. Fill a bucket or laundry basket up with sock balls and take turns trying to knock it down. When you knock it off one level, move it one rung higher. How many throws does it take you?"
            )
        )
        mList.add(
            AdultsData(
                "Cocktail making",
                R.drawable.cocktail,
                "."
            )
        )
        mList.add(
            AdultsData(
                "Who is most likely to?",
                R.drawable.most,
                "Each player will have a chance to be the judge. They’ll ultimately decide on who the card best describes from the other player’s nominations. Loser is who reaches seven cards first. But prepare yourselves, this game is not for the faint of heart.."
            )
        )
        mList.add(
            AdultsData(
                "Go-karting",
                R.drawable.karting,
                "This is fun for people who like racing. "
            )
        )
        mList.add(
            AdultsData(
                "Movies",
                R.drawable.movie,
                "Movies is always a good idea no matter what age.Just get loads of popcorn and candy and drinks and all is well!"
            )
        )
        mList.add(
            AdultsData(
                "Zip lining",
                R.drawable.ziplining,
                "Fun activity for one who loves to be out in the open."

            )
        )
        mList.add(
            AdultsData(
                "Pajama party",
                R.drawable.pajama ,
                "Pajama parties while having a mask on,talking,taking pictures and sipping on alcohol.You could book an airbnb and just have fun.Wear onesies."
            )
        )
        mList.add(
            AdultsData(
                "Jazz music",
                R.drawable.jazz,
                "For the jazz lovers this idea would be amazing.Jazz is just soothing to the soul."
            )
        )
        mList.add(
            AdultsData(
                "Concert",
                R.drawable.concert,
                "Any type of concert would be great.You could travel to the place or even go to a nearby place,choice is yours"
            )
        )
        mList.add(
            AdultsData(
                "X-Box",
                R.drawable.xbox,
                "Plan a sleepover party for your girls with a customized tepee and some midnight snacks and eye masks. "
            )
        )
        mList.add(
            AdultsData(
                "Paint and sip",
                R.drawable.paint,
                "Take the kids to the zoo to see some animals.Petting the friendly animals would be fun. "
            )
        )
        mList.add(
            AdultsData(
                "Wine and cheese",
                R.drawable.cheese,
                "As you do this, you could discuss a book."
        )
    )
        mList.add(
            AdultsData(
                "Watch a match",
                R.drawable.match,
                "Watch any type of match and have drinks!Maybe add a theme."
            )
        )
        mList.add(
            AdultsData(
                "Go for an outing",
                R.drawable.outing,
                "You could go for a nice brunch,lunch,dinner while you chitchat."
            )
        )

    }
}

