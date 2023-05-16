package com.example.mypartyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class WedAdapter(private var mList: List<WedData>) :
    RecyclerView.Adapter<WedAdapter.LanguageViewHolder>()  {
    inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logo: ImageView = itemView.findViewById(R.id.logoIv)
        val titleTv: TextView = itemView.findViewById(R.id.titleTv)
        val langDescTv: TextView = itemView.findViewById(R.id.langDesc)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)

        fun collapseExpandedView(){
            langDescTv.visibility = View.GONE
        }
    }

    fun setFilteredList(mList: List<WedData>) {
        this.mList = mList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item8, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {

        val WedData = mList[position]
        holder.logo.setImageResource(WedData.logo)
        holder.titleTv.text = WedData.title
        holder.langDescTv.text = WedData.desc

        val isExpandable: Boolean = WedData.isExpandable
        holder.langDescTv.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout.setOnClickListener {
            isAnyItemExpanded(position)
            WedData.isExpandable = !WedData.isExpandable
            notifyItemChanged(position , Unit)
        }

    }

    private fun isAnyItemExpanded(position: Int){
        val temp = mList.indexOfFirst {
            it.isExpandable
        }
        if (temp >= 0 && temp != position){
            mList[temp].isExpandable = false
            notifyItemChanged(temp , 0)
        }
    }

    override fun onBindViewHolder(
        holder: LanguageViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {

        if(payloads.isNotEmpty() && payloads[0] == 0){
            holder.collapseExpandedView()
        }else{
            super.onBindViewHolder(holder, position, payloads)

        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}
