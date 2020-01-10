package com.example.testgiaodien.Fragment


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testgiaodien.Adapter.CustomAdapter
import com.example.testgiaodien.Model.Images
import com.example.testgiaodien.R
import kotlinx.android.synthetic.main.fragment_grid_view.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class GridViewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater?.inflate(R.layout.fragment_grid_view, container, false)
        // Inflate the layout for this fragment
        var arrayImages : ArrayList<Images> = ArrayList()
        arrayImages.add(Images(R.drawable.hinh2))
        arrayImages.add(Images(R.drawable.hinh4))

        arrayImages.add(Images(R.drawable.hinh3))
        arrayImages.add(Images(R.drawable.hinh2))
        arrayImages.add(Images(R.drawable.hinh4))
        arrayImages.add(Images(R.drawable.hinh3))
        arrayImages.add(Images(R.drawable.hinh2))
        arrayImages.add(Images(R.drawable.hinh4))
        arrayImages.add(Images(R.drawable.hinh2))
        arrayImages.add(Images(R.drawable.hinh3))
        arrayImages.add(Images(R.drawable.hinh2))
        arrayImages.add(Images(R.drawable.hinh4))


        Log.e("mang",arrayImages.size.toString())
        view.grid_view.adapter = CustomAdapter(view.context, arrayImages)
        return view
    }


}
