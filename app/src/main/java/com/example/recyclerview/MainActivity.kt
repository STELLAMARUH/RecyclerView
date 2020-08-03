package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import layout.NamesRecyclerViewAdapter
import androidx.recyclerview.widget.LinearLayoutManager as LinearLayoutManager1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager1(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("Andrew", "Pauline", "Sue", "Manuel", "Veronica", "Arthur", "Esther", "David", "Patience"))
        rvNames.adapter = namesAdapter


    }
}