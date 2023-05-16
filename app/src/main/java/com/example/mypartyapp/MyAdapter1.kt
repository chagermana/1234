package com.example.mypartyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyAdapter1 (var mycntx: Context, var resources:Int, var items:List<Models>):ArrayAdapter<Models>(mycntx,resources,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflator:LayoutInflater=LayoutInflater.from(mycntx)
        val view:View=layoutInflator.inflate(resources,null)
        val imageView:ImageView=view.findViewById(R.id.image)
        val Tv_title:TextView=view.findViewById(R.id.Tv_maintext)
        val Tv_description:TextView=view.findViewById(R.id.Tv_subtext)

        var myitems:Models=items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        Tv_title.text=myitems.title
        Tv_description.text=myitems.description

        return view
    }
}
