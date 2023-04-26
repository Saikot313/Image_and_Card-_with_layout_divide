package com.example.image_and_card_with_layout_divide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var txv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        txv = findViewById(R.id.tv)

        btn.setOnClickListener {
            txv.text = "The city of Rajshahi is the divisional headquarters of Rajshahi division as well as the administrative district that bears its name and " +
                    "is one of the six metropolitan cities of Bangladesh. Often referred to as Silk City and Education City, Rajshahi is located at 24.40°N 88.50°E and " +
                    "is situated on the northern banks " +
                    "of the river Padma. It consists of nine Upazilas,14 Pourasavas and seventy one unions. Rajshahi was formerly known as Rampur Boalia."
        }

    }
}