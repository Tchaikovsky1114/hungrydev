package com.eremes.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class StarterActivity : AppCompatActivity() {

    private lateinit var startersList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starters)

        startersList = findViewById(R.id.listViewStarters)

        val dishes = arrayOf(
            "Mushroom and tofu maki",
            "Egg and avocado uramaki",
            "Melon and lemon soup",
            "Coconut and chocolate mousse",
            "Spinach and cabbage wontons",
            "Broccoli and cucumber soup",
            "Chilli and aubergine dip",
            "Chickpea and chilli gyoza",
            "Sprout and pineapple soup",
            "Egusi and borscht soup",
            "Aubergine and egg sushi",
            "Artichoke and mustard soup",
            "Peppercorn and tamarind soup",
            "Parsley and celeriac parcels",
            "Pasta and broccoli soup",
            "Potato and courgette soup",
            "Chickpea and cabbage parcels",
            "Coriander and peppercorn gyoza",
            "Pear and chestnut soup",
            "Pesto and garam masala parcels"
        )

        val dishesAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dishes)

        startersList.adapter = dishesAdapter
    }
}