package com.timplifier.newsapp.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.timplifier.newsapp.R
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}