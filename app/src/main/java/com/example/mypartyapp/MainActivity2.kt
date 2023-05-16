package com.example.mypartyapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity2 : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var itemList:ArrayList<Int>
    private lateinit var itemAdapter:ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)




        init()
    }

    private fun init(){
        itemList= ArrayList()
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        addToList()
        var itemAdapter = ItemAdapter(itemList)
        recyclerView.adapter=itemAdapter
    }

    private fun addToList(){
        itemList.add(R.drawable.birthdayanimated)
        itemList.add(R.drawable.graduation)
        itemList.add(R.drawable.babyshower)
        itemList.add(R.drawable.wedding)


    }


}

