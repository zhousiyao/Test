package com.zsy.superp.kt.view

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.zsy.superp.R
import com.zsy.superp.kt.util.LogUtils

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        findViewById<RecyclerView>(R.id.rv_view)
    }

    override fun onStart() {
        super.onStart()
        LogUtils.e("FirstActivity  ----   onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtils.e("FirstActivity  ----   onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtils.e("FirstActivity  ----   onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtils.e("FirstActivity  ----   onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtils.e("FirstActivity  ----   onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        LogUtils.e("FirstActivity  ----   onSaveInstanceState")
    }

    fun toSecond(view: View) {

        startActivity(Intent(this,SecondActivity::class.java))
    }

    fun showDialog(view: View) {

        val dialogBuild = AlertDialog.Builder(this)
        dialogBuild.setTitle("我是标题")
        dialogBuild.setMessage("我是内容")
        dialogBuild.setCancelable(true)
        dialogBuild.setNegativeButton("234"
        ) { dialog, _ -> dialog?.dismiss() }
        dialogBuild.setOnCancelListener {
            it.dismiss()
        }
        dialogBuild.create().show()

    }
}