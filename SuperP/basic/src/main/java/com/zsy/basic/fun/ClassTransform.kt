package com.zsy.basic.`fun`

import android.app.Activity

class ClassTransform {

    class NewActivity : Activity(){
        fun newFunction(){}
    }

    fun test(){

        var newActivity:Activity = NewActivity()

        if(newActivity is NewActivity){
            //newActivity对象不需要强转即可调用子类实际对象方法
            newActivity.newFunction()
        }

        //注： 强转方案
        newActivity as? NewActivity //如果newActivity强转不成功就不继续执行了
        newActivity as NewActivity? //如果newActivity对象为null 强转时也不会报错
        newActivity as? NewActivity? //newActivity为null的情况下仍然可以强转，如果强转不成功则不会向下执行后面的函数调用
    }
}