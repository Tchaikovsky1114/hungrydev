package com.eremes.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainCourseActivity : AppCompatActivity() {
    private lateinit var mainCourseList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_course)

        mainCourseList = findViewById(R.id.listViewMainCourses)

        val mains = arrayListOf(
         Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
         Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
         Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
         Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
         Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
         Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
         Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
         Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)
        )

        mainCourseList.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mains)

    }
}