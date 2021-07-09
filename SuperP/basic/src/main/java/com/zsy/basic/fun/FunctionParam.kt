package com.zsy.basic.`fun`

class FunctionParam {

    //有三种方式：
    // :: 将函数转化为对象

    fun mFunParam(funP: () -> Unit){

    }

    fun mFunResult() : () -> Unit{
        mFunParam { print("就爱买手机") }

        val m = mFunParam { print("传递参数") }

        return  { var a = 123}
    }
}