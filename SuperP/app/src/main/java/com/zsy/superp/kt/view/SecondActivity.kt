package com.zsy.superp.kt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.zsy.superp.R
import com.zsy.superp.kt.util.LogUtils

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        LogUtils.e("SecondActivity  ----   onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtils.e("SecondActivity  ----   onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtils.e("SecondActivity  ----   onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtils.e("SecondActivity  ----   onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtils.e("SecondActivity  ----   onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        LogUtils.e("SecondActivity  ----   onSaveInstanceState")
    }
}