package com.example.testgiaodien.Fragment


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testgiaodien.Adapter.ExpandableListAdapter
import com.example.testgiaodien.R
import kotlinx.android.synthetic.main.fragment_item_multiple.*
import kotlinx.android.synthetic.main.fragment_item_multiple.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ItemMultipleFragment : Fragment() {
    val header: MutableList<String> = ArrayList()
    val body: MutableList<MutableList<String>> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater?.inflate(R.layout.fragment_item_multiple, container, false)
        val season1: MutableList<String> = ArrayList()
        season1.add("Winter is Coming")
        season1.add("The Kingsroad")
        season1.add("Lord Snow")



        val season2: MutableList<String> = ArrayList()
        season2.add("The North Remembers")
        season2.add("The Night Lands")
        season2.add("What is Dead May Never Die")


        header.add("Season 1")
        header.add("Season 2")

        body.add(season1)
        body.add(season2)


        Log.e("header",header[1])
        Log.e("body",body[1].toString())

        view.expandableListView.setAdapter(ExpandableListAdapter(view.context,view.expandableListView,header,body))
        return view
    }


}
