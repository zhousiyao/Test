package com.zsy.basic.symbol

import android.util.Log

//文章：https://rengwuxian.com/kotlin-basic-1/
class NullExercise {

    var name:String? = null
        get(){
            return field
        }
        set(value){
            field = value
        }
    var sex : String? = null



    fun compare(){

        name?.toCharArray() //如果name为null后面则不会执行
        name!!.toCharArray() //如果name为null则抛出异常
    }
}