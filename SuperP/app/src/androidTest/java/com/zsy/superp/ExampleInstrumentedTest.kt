package com.zsy.superp

import android.util.Log
import android.widget.Toast
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {

        println("AAAAAA")
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.zsy.superp", appContext.packageName)

        println("BBBBB")
//        Toast.makeText(appContext,"测试测试",Toast.LENGTH_SHORT).show()
        Log.d("testtest","测试日志")
    }
}