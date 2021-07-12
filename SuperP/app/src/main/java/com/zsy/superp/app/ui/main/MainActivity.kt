package com.zsy.superp.app.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zsy.superp.R
import com.zsy.superp.app.ui.main.lifecycle.MainLifeCycle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        lifecycle.addObserver(MainLifeCycle())
    }
}