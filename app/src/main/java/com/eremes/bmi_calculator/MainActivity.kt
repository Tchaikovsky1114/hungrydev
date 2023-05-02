package com.eremes.bmi_calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var cardViewStarters: CardView
    private lateinit var cardViewMains: CardView


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardViewStarters = findViewById(R.id.cardViewStarters)
        cardViewMains = findViewById(R.id.cardViewMains)

        cardViewStarters.setOnClickListener() {
            // (::)더블콜론 연산자는 런타임에 함수나 프로퍼티를 참조하는 데 사용
            val intent = Intent(this, StarterActivity::class.java)
            startActivity(intent)
        }
        cardViewMains.setOnClickListener() {
            val intent = Intent(this, MainCourseActivity::class.java)
            startActivity(intent)
        }
    }
}

