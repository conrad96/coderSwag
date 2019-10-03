package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryAdapter
import com.example.coderswag.services.Dataservice
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, Dataservice.category)

        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener{
           adapterView, view, i, l ->
            val category = Dataservice.category[i]
            Toast.makeText(this, "You tapped the ${category.title} tab", Toast.LENGTH_SHORT).show()
        }
    }
}
