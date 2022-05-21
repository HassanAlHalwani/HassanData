package com.example.hassandata

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun togosecond_activity (view: View) {
            val name = findViewById<TextView>(R.id.name).text.toString()
            val surname = findViewById<TextView>(R.id.surname).text.toString()
            val age = findViewById<TextView>(R.id.age).text.toString()
            val country = findViewById<TextView>(R.id.country).text.toString()
            val message = "Name :${name} \nSurname :${surname} \nAge :${age} \nCountry :${country}\n"

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
        }
            startActivity(intent)

        }
    }

