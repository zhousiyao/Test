package com.xxx.arithmeticlearn

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val fl_content: FrameLayout = findViewById(R.id.fl_content)

        var i = 0
        var flRoot = FrameLayout(this)
        fl_content.addView(flRoot)
        val max = 1400;
        while (i<max){
            val flChild = FrameLayout(this)
            val tv = TextView(this)
            var content = "内容 = "+i
            if (i == max-1){
                content += ("   最后一层"+i)
            }
            tv.setText(content)
            flChild.addView(tv);
            flRoot.addView(flChild)
            flRoot = flChild
            i++
        }
    }
}