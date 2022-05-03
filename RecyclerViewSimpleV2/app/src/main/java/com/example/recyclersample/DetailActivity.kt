package com.example.recyclersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val flower: String = intent.getStringExtra("flower").toString()
        val string = "$flower is a nice flower"

        val tv: TextView = findViewById(R.id.tv)
        tv.text = string
    }
}
