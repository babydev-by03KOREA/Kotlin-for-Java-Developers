package com.java.lifecycle.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.java.lifecycle.R

class MainActivity: AppCompatActivity() {
    // constructor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}