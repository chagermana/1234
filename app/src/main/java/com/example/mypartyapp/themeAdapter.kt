package com.example.mypartyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class themeAdapter(private val themesList:ArrayList<themes>)
    :RecyclerView.Adapter<themeAdapter.themeViewHolder>(){

    class themeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.img_toystory)
        val textView:TextView=itemView.findViewById(R.id.Txt_Toystory)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): themeViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.eachitem_2,parent,false)
        return themeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return themesList.size
    }

    override fun onBindViewHolder(holder: themeViewHolder, position: Int) {
        val theme=themesList[position]
        holder.imageView.setImageResource(theme.image)
        holder.textView.text=theme.name
    }
}