package com.example.testgiaodien.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.testgiaodien.Model.Images
import com.example.testgiaodien.R

class CustomAdapter(var con: Context, var manghinh : ArrayList<Images>) : BaseAdapter() {


    class ViewHolder(row:View){
        var images : ImageView
        init {
            images = row.findViewById(R.id.image) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        var view : View?
        var viewholder : ViewHolder
        if(convertView == null)
        {
                var layoutinflater : LayoutInflater = LayoutInflater.from(con)
                view = layoutinflater.inflate(R.layout.item_gridview,null)
                viewholder = ViewHolder(view)
                view.tag = viewholder

        }
        else{
            view = convertView
            viewholder = convertView.tag as ViewHolder
        }
        var images: Images = getItem(position) as Images
        viewholder.images.setImageResource(images.hinhanh)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return manghinh.get(position)
}

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return manghinh.size
    }
}