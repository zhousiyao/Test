package com.zsy.basic

import android.util.Log
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
        // Context of the app under test.
        print("AAAAAA")
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.zsy.basic.test", appContext.packageName)
        print("AAAAAA")
        Log.d("testtest","测试日志")
        val nums = listOf(1,2,4,3,6)

        nums.filter { it >0 }
            .map { it*5 }
            .groupBy { it.toString().last() }
            .forEach{
                print("前 ${it.key}")
                for (num in it.value){
                    print("中 ${it.value}")
                }
                println()
            }

    }

    @Test
    fun startTest() {
        print("AAAAAA")
    }
}