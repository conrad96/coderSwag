package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryAdapter
import com.example.coderswag.adapters.CategoryRecycleAdapter
import com.example.coderswag.services.Dataservice
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, Dataservice.category){
            category -> println(category.title)
        }

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)

        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)
    }
}
