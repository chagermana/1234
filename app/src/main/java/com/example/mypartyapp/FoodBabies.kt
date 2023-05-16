package com.example.mypartyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class FoodBabies: AppCompatActivity() {

    private lateinit var recyclerViewfood: RecyclerView
    private lateinit var searchViewfood: SearchView
    private var mList = ArrayList<FoodData>()
    private lateinit var adapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_babies)

        recyclerViewfood = findViewById(R.id.recyclerViewfood)
        searchViewfood = findViewById(R.id.searchViewfood)

        recyclerViewfood.setHasFixedSize(true)
        recyclerViewfood.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = FoodAdapter(mList)
        recyclerViewfood.adapter = adapter

        searchViewfood.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
            val filteredList = ArrayList<FoodData>()
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
            FoodData(
                "Food",
                R.drawable.foodbabies,
                "chips\n"+
                        "\n"+
                        "sausages(any meat)\n"+
                        "\n"+
                        "chicken wings\n"+
                        "\n"+
                        "hotdogs(any meat)\n"+
                        "\n"+
                        "pizaa\n"+
                        "\n"+
                        "burgers\n"+
                        "\n"+
                        "chicken nuggets\n"+
                        "\n"+
                        "pasta\n"



            )
        )
        mList.add(
            FoodData(
                "Drinks",
                R.drawable.drinks,
                "Well we would require drinks too to quench thirst so...\n"+
                        "\n"+
                        "soda(coke,bittter lemon,ginger ale,fanta orange,blackcurrent,sprite)\n"+
                        "\n"+
                        "juice(orange,passion,mango,apple,ribena,lemonade)\n"+
                        "\n"+
                        "water"
            )
        )
        mList.add(
            FoodData(
                "Snacks",
                R.drawable.snacks,
                "crisps\n"+
                        "\n"+
                        "cupcakes\n"+
                        "\n"+
                        "biscuits\n"+
                        "\n"
            )
        )
        mList.add(
            FoodData(
                "Sweet stuffs",
                R.drawable.sweet,
                "sweets\n"+
                        "\n"+
                        "lollipops\n"+
                        "\n"+
                        "ice lollies\n"+
                        "\n"+
                        "icecream(vanilla,chocolate,strawberry,kulfi,oreo,chocolate chips,cookies and cream,caramel,rasberry,butterscotch,bubblegum)\n"+
                        "\n"+
                        ""

            )
        )


    }
}