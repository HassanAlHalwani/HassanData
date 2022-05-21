package com.example.hassandata

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val message = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

    }
    fun togofirst_activity (view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}