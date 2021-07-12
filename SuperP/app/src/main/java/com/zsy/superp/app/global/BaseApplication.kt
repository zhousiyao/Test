package com.zsy.superp.app.global

import android.app.Application

class BaseApplication : Application() {

    companion object{
        lateinit var INSTANCE:BaseApplication
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }

}