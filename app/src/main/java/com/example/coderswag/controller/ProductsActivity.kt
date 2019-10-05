package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductAdapter
import com.example.coderswag.services.Dataservice
import com.example.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val category = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(this, Dataservice.getProducts(category))

        val layoutManager = GridLayoutManager(this, 2)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
