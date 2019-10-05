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
        Product("Devslopes Graphic Beanie", "hat01", "$18.0"),
        Product("Devslopes Hat Black", "hat02", "$20.0"),
        Product("Devslopes Hat White", "hat03", "$18.0"),
        Product("Devslopes Hat Snapback", "hat04", "$22.0")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "hoodie01", "$28.0"),
        Product("Devslopes Hoodie Red", "hoodie02", "$32.0"),
        Product("Devslopes Gray Hoodie", "hoodie03", "$28.0"),
        Product("Devslopes Black Hoodie", "hoodie04", "$32.0")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "shirt01", "$18.0"),
        Product("Devslopes Badge Light Gray", "shirt02", "$20.0"),
        Product("Devslopes Logo Shirt Red", "shirt03", "$22.0"),
        Product("Devslopes Hustle", "shirt04", "$18.0"),
        Product("Kickflip Studios", "shirt05", "$19.0")
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