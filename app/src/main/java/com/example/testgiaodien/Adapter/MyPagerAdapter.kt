package com.example.testgiaodien.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.testgiaodien.Fragment.GridViewFragment
import com.example.testgiaodien.Fragment.ItemMultipleFragment

class MyPagerAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> GridViewFragment()
            else -> return ItemMultipleFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position)
        {
            0 -> "Load Gridview"
            else -> return "ExpandableListView"
        }
    }
}