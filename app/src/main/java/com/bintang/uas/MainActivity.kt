package com.bintang.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.sythetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_food.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java);
            startActivity(intent);
        }
        card_home.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java);
            startActivity(intent);
        }
        card_child.setOnClickListener {

            val intent = Intent(this, ChildActivity::class.java);
            startActivity(intent);
        }
        card_healt.setOnClickListener {

            val intent = Intent(this, HealthActivity::class.java);
            startActivity(intent);
        }
    }
}