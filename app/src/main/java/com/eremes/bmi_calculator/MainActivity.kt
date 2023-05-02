package com.eremes.bmi_calculator

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
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
    private lateinit var textViewEmailAddress:TextView
    private lateinit var cardViewDesserts: CardView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardViewStarters = findViewById(R.id.cardViewStarters)
        cardViewMains = findViewById(R.id.cardViewMains)
        textViewEmailAddress = findViewById(R.id.textViewEmailAddress)
        cardViewDesserts = findViewById(R.id.cardViewDesserts)

        cardViewStarters.setOnClickListener() {
            // (::)더블콜론 연산자는 런타임에 함수나 프로퍼티를 참조하는 데 사용
            val intent = Intent(this, StarterActivity::class.java)
            startActivity(intent)
        }
        cardViewMains.setOnClickListener() {
            val intent = Intent(this, MainCourseActivity::class.java)
            startActivity(intent)
        }
        cardViewDesserts.setOnClickListener() {
            val intent = Intent(this, DessertActivity::class.java)
            startActivity(intent)
        }
        textViewEmailAddress.setOnClickListener() {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("forwarm5891@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "HungryDeveloper Feedback")
                putExtra(Intent.EXTRA_STREAM, "Hello, I am ...")
            }
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, "No email app found", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

