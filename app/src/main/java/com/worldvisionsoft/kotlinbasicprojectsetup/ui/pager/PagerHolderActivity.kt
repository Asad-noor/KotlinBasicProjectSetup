package com.worldvisionsoft.kotlinbasicprojectsetup.ui.pager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.worldvisionsoft.kotlinbasicprojectsetup.R
import kotlinx.android.synthetic.main.activity_pager_holder.*

class PagerHolderActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager_holder)

        val list: ArrayList<String> = ArrayList()
        list.add("First Screen")
        list.add("Second Screen")
        list.add("Third Screen")
        list.add("Fourth Screen")

        var adapterPagerHolder = AdapterPagerRecycler(list)
        vpHolder.adapter = adapterPagerHolder
    }
}