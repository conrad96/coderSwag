package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object Dataservice {
    val category = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "hat1", "$18.0"),
        Product("Devslopes Hat Black", "hat2", "$20.0"),
        Product("Devslopes Hat White", "hat3", "$18.0"),
        Product("Devslopes Hat Snapback", "hat4", "$22.0")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "hoodie1", "$28.0"),
        Product("Devslopes Hoodie Red", "hoodie2", "$32.0"),
        Product("Devslopes Gray Hoodie", "hoodie3", "$28.0"),
        Product("Devslopes Black Hoodie", "hoodie4", "$32.0")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "shirt1", "$18.0"),
        Product("Devslopes Badge Light Gray", "shirt2", "$20.0"),
        Product("Devslopes Logo Shirt Red", "shirt3", "$22.0"),
        Product("Devslopes Hustle", "shirt4", "$18.0"),
        Product("Kickflip Studios", "shirt5", "$19.0")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS"-> shirts
            "HATS"-> hats
            "HOODIES"-> hoodies
            else -> digitalGood
        }
    }
}