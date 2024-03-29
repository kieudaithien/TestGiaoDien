package com.example.testgiaodien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testgiaodien.Adapter.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        ViewPaper.adapter = fragmentAdapter

        tablayout.setupWithViewPager(ViewPaper)
    }
}
