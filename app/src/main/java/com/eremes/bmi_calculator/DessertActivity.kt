package com.eremes.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DessertActivity : AppCompatActivity() {

    private lateinit var dessertsList: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)

        dessertsList = findViewById(R.id.listViewDesserts)

        val desserts = arrayOf(
         Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
         Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
         Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
         Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
         Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499),
        )
        dessertsList.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, desserts)
    }
}