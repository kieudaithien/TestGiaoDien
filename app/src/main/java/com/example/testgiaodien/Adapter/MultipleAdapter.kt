package com.example.testgiaodien.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testgiaodien.Model.Item

class MultipleAdapter(val context: Context,val items : ArrayList<Item>) : RecyclerView.Adapter<MultipleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class MyViewHolder(itemView :View): RecyclerView.ViewHolder(itemView){

    }
}