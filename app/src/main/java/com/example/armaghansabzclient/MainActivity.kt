package com.example.armaghansabzclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val ViewPager = findViewById<ViewPager2>(R.id.viewPager)

//        ViewPager.adapter = adapter
//        TabLayoutMediator(TabLayout,ViewPager){tab,position ->
//            when(position){
//                0->{
//                    tab.text = "User"
//            }
//                1->{
//                    tab.text = "Manager"
//                }
//        }
//        }.attach()

    }
}