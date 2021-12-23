package com.example.armaghansabzclient

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager:FragmentManager,lifeCycle:Lifecycle):FragmentStateAdapter(fragmentManager,lifeCycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
      return  when (position) {
            0 -> {
                LoginFragment()
            }
            1 -> {
                LoginManagerFragment()
            }
            else ->{
                Fragment()
            }
        }
    }
}