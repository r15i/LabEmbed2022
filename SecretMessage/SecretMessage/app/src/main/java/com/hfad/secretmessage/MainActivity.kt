package com.hfad.secretmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


//only loads the main activity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
