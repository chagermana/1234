package com.example.mypartyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.Language
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
                "A tie-dye party is a great way to throw a bright and colorful birthday party. And the kids will have an automatic party favor to take home and wear for years to come."
            )
        )
        mList.add(
            LanguageData(
                "karaoke",
                R.drawable.karaoke,
                "Fire up the karaoke machine and let the kids be silly! This pairs well with a glow stick dance party, movie night, and sleepover or under night.."
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
                "Movies would be splendid.his can be part of a sleepover or an “under night” (when the kids get picked up before bedtime.\n" +
                        "\n" +
                        "To make it memorable, have everyone lay out their sleeping bags or blankets, pop some popcorn (you can add candy like gummy bears to the popcorn to make it even more special), and turn out all the lights! This is an especially great option for a small group.\n" +
                        "\n" +
                        "Variation: Outdoor Movie Night! Snuggle up on an outdoor blanket and watch a movie outside."
            )
        )
        mList.add(
            LanguageData(
                "Water gun fight",
                R.drawable.watergun,
                "That is super fun.Just have the kids grab their own guns from their respective homes or supply them in case you have them or even buy for it shall be worth it!Another awesome idea would be water balloons which are cheaper as compared to the guns"
            )
        )
        mList.add(
            LanguageData(
                "Musical chairs",
                R.drawable.musicalchairs,
                "An enjoyable thing to have music playing while walking around chairs with the anxiety of the music stopping all of a sudden which means having to grab a chair.  "
            )
        )
        mList.add(
            LanguageData(
                "Face painting",
                R.drawable.facepainting,
                "Depending on the theme, you could hire someone to face paint the kids. "
            )
        )
        mList.add(
            LanguageData(
                "DIY pizza Party",
                R.drawable.pizza,
                "DIY Pizza Party: Host a DIY pizza party and let guests create their own pizzas with a variety of toppings. Provide pre-made pizza crusts, tomato sauce, cheese, and a variety of toppings like pepperoni, mushrooms, and peppers. Bake the pizzas in the oven and serve with snacks and drinks."
            )
        )
        mList.add(
            LanguageData(
                "Cookie decorating",
                R.drawable.cookiedecorating,
                "You will require various decorations."
            )
        )
        mList.add(
            LanguageData(
                "Hide and seek",
                R.drawable.hideandseek,
                "A wonderful game where one of the players counts to a certain number depending on the number of kids playing while the rest of the kids hide.Ready or not here I come!!"
            )
        )
        mList.add(
            LanguageData(
                "Balloon up",
                R.drawable.balloonup,
                "A balloon is required for this game where all you need is to keep on hitting the balloon without having it touch the ground."

            )
        )
        mList.add(
            LanguageData(
                "Red-letter",
                R.drawable.game,
                "A little game that gets your kids thinking.There is a talking kid and the rest of the kids.The distance between the two i.e talking kid and the rest of the kids is approximately 5 metres.The talking kid says a letter and the rest of the kids move those number of letters forward e.g 'Letter a' ,one of the kids names is Maya so Maya will move 2 steps because she has 2 a's in her name.So once any of the the rest of the kids  reach the talking,the talking kid chases them all until they get one the kids for it to become the caught kids turn."
            )
        )
        mList.add(
            LanguageData(
                "Chocolate box",
                R.drawable.games,
                "Similar to Red-letter where there is the talking kid and the rest of the kids.Basically, the talking kid will choose a group of anything say names of fruits,cars and tell the rest of the kids.Afterwards, the rest of the kids will choose their fruits and one of them will become the messenger kid and tell the talking kid the options from which the talking kid will pick one.As soon as the other kids hears their fruit, both the talking kid and the the other kid whose fruit was mentioned will run 4 times back and forth.Whoever reaches first will become the talking kid and the one who was slow will join the rest of the kids"
            )
        )
        mList.add(
            LanguageData(
                "Stuck in the mud",
                R.drawable.mud,
                "Another splendid and fun game.There is the chaser.If the chaser catches you you are 'stuck in the mud' with your legs apart and so the only way you can get out is if the other kids who arent stuck in the mud go pass in between your legs almost like a passageway.This way once everyone gets caught the game is over and so another player becomes a chaser. "
            )
        )
        mList.add(
            LanguageData(
                "Doctor ,doctor we are stuck",
                R.drawable.doctor,
                "A very confusing situation kind of a game.So, there is a doctor and the rest of the kids.The doctor faces away from the other kids while they other kids hold hands to make a circle and then get themselves tangled up.Once they are done,all they have to do is say 'Doctor,doctor we are stuck and so the doctor will come and untangle the kids."

            )
        )
        mList.add(
            LanguageData(
                "London Statue Stop",
                R.drawable.london,
                "A fun game.So we have the kid who will say london statue stop while facing away from the kids.ONce they finish saying 'london statue stop', they will turn around and face the other kids and who will have to freeze.If the london statue stop kid sees the freezing kids, they will be removed from the game.The aim of the freezing kids is to compete to reach the other side which when once achieved will become the london statue stopper."
            )
        )
        mList.add(
            LanguageData(
                "Slip n' Slide n' Grab",
                R.drawable.grab,
                "When you can’t have a pool party, a slip n’ slide is the best way to get wet and wild! Better yet, place random objects along the slip n slide. Try to grab them as you slide down! Any 8-year-old boy or girl would love to have a slip n’ slide birthday party."

            )
        )
        mList.add(
            LanguageData(
                "Frisbee Toss",
                R.drawable.frisbee,
                "Hone your frisbee throwing skills. Grab a bucket or laundry basket, and have each birthday guest try to toss the frisbee in from varying lengths across the yard."
            )
        )
        mList.add(
            LanguageData(
                "Climb the ladder",
                R.drawable.ladder,
                "Go grab the ladder from the garage and place a bottle on the bottom rung. Fill a bucket or laundry basket up with sock balls and take turns trying to knock it down. When you knock it off one level, move it one rung higher. How many throws does it take you?"
            )
        )
        mList.add(
            LanguageData(
                "Obstacle race",
                R.drawable.race,
                "This age group loves a good challenge. Grab some cones, hula hoops, outdoor blankets, small stools, and any other equipment you could use for an outdoor obstacle course. Time each other running through. Who can do it fastest? This is a simple, fun way to get active."
            )
        )
        mList.add(
            LanguageData(
                "Freeze Dance",
                R.drawable.dance,
                "Bring a speaker outside and blast your favorite music. When the music stops, everyone freezes! You can also play musical chairs, where everyone has to sit down in a chair when the music stops. Take one chair away each round."
            )
        )
        mList.add(
            LanguageData(
                "Dark room",
                R.drawable.room,
                "A fun indoor game.All you have to do is to pick a spot in the house like room while its dark and play hide and seek.The seeker wil switch of the lights while the rest will hide then switch on the light and find the kids hiding. "
            )
        )
        mList.add(
            LanguageData(
                "Flashlight Tag",
                R.drawable.tag,
                "At your next party, bring out your flashlights and play flashlight tag, shadow charades, catch the light, or flashlight limbo, or have a flashlight disco party!"
            )
        )
        mList.add(
            LanguageData(
                "Limbo",
                R.drawable.limbo,
                "All you need is a pole or skipping rope and just play some music\n."+
                        "\n"+
                        "Limbo is a popular game, based on traditions that originated on the island of Trinidad. The aim is to pass forwards under a low bar without falling or dislodging the bar.\n" +
                        "\n" +
                        "Ever wondered about limbos origin?The dance originated as an event that took place at wakes in Trinidad. It was popularized in the 1950s by dance pioneer Julia Edwards[1] (known as the First Lady of Limbo) and her company which appeared in several films, in particular Fire Down Below (1957), and toured widely in the Caribbean, Europe, North America, South America, Asia, and Africa in the 1960s and later."

            )
        )
        mList.add(
            LanguageData(
                "Twister",
                R.drawable.twister,
                "Get twisted"
            )
        )
        mList.add(
            LanguageData(
                "Giant jenga",
                R.drawable.jenga,
                "Stack and then remove one by one.What a wonderful game\n"+
                        "\n"+
                        "Here is a little something about jenga.Leslie Scott (born December 18, 1955) is a British board game designer and author,[1] best known as the inventor of the game Jenga, which she launched at the London Toy Fair 1983.Born in East Africa, Leslie Scott grew up fluent in both English and Swahili. Jenga evolved from a stacking game her family played with simple wood blocks. Back in England in the 1980s, Scott began manufacturing her game and trademarked the name “Jenga,” a form of the Swahili word kujenga, which means “to build."
            )
        )
        mList.add(
            LanguageData(
                "Arts and Crafts",
                R.drawable.crafts,
                "You could choose a specific theme like jewelry making or painting.This would bring out the creative side of the kids."
            )
        )
        mList.add(
            LanguageData(
                "Sleep Over party",
                R.drawable.sleepoverparty,
                "Plan a sleepover party for your girls with a customized tepee and some midnight snacks and eye masks. "
            )
        )
        mList.add(
            LanguageData(
                "Zoo",
                R.drawable.zoo,
                "Take the kids to the zoo to see some animals.Petting the friendly animals would be fun. "
            )
        )
        mList.add(
            LanguageData(
                "Hopscotch",
                R.drawable.hopscotch,
                "Draw a traditional hopscotch diagram like the one described above. (Tip: Chalk is ideal for drawing courts on asphalt and pavement outdoors.\n"+
                        "\n"+
                        "Throw a small stone, twig, beanbag, or another marker into the first square. (The object has to land inside the square without touching the borderline or bouncing out; if it lands on a line or outside the square, you lose your turn. Pass the marker to the following player and wait for your next turn to try again.)\n"+
                        "\n"+
                        "If the object successfully lands in the first square, hop on one foot into the first empty square, and then every subsequent empty square in numerical order. Be sure to skip the one your marker is in.\n"+
                        "\n"+
                        "At the pairs (usually at 4-5 and 7-8), land on both feet, one in each square.\n"+
                        "\n"+
                        "At 10, land with both feet, turn around, and head back toward the start.\n"+
                        "\n"+
                        "When you reach the marked square again, pick up the marker—still on one foot!—and complete the course.\n"+
                        "\n"+
                        "This is an amazing game.Be sure to try it out."

            )
        )
        mList.add(
            LanguageData(
                "Bouncing Castle",
                R.drawable.bouncingcastle,
                "Depending on our theme,you could have a bouncing castle.The kids would truly enjoy this."
            )
        )
        mList.add(
            LanguageData(
                "Trampoline",
                R.drawable.trampoline,
                "This is another jumpy thing the kids would enjoy."
            )
        )



    }
}