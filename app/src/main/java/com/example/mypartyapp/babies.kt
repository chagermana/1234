package com.example.mypartyapp

import android.content.Intent
import android.content.res.Resources.Theme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class babies : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<cartoons>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>
    lateinit var Cartoons:Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_babies)

        imageId= arrayOf(
            R.drawable.theme,
            R.drawable.activities,
            R.drawable.food

        )

        heading= arrayOf(
            "THEMES",
            "ACTIVITIES",
            "FOOD"
            )

        Cartoons= arrayOf(
            getString(R.string.TODO),
            getString(R.string.group_a,),
            getString(R.string.group_a1)


        )



        newRecyclerView=findViewById(R.id.recyclerview_babies)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<cartoons>()
        getUserdata()



    }

    private fun getUserdata() {

        for(i in imageId.indices){
            val cartoons= cartoons(imageId[i],heading[i])
            newArrayList.add(cartoons)

        }

        var adapter=MyAdapter(newArrayList)
        newRecyclerView.adapter=adapter
        adapter.setOnItemClickListener(object:MyAdapter.onItemClickListener{
            override fun onItemCLick(position: Int) {
                //Toast.makeText(this@babies,"You clicked on item no $position",Toast.LENGTH_SHORT).show()


                val intent=Intent(this@babies,CartoonsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("Cartoons",Cartoons[position])
                startActivity(intent)













            }

        })

    }

}