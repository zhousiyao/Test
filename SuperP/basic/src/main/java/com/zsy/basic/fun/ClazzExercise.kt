package com.zsy.basic.`fun`

class ClazzExercise {

    //默认class 是 final的
    //如果想要 ClazzExercise可被继承
    // open class ClazzExercise
    lateinit var a:String

    open class A{

    }

    class B : A(){
        //此时B仍然是final的，所以说继承open class是不会遗传的
        //override 是具有遗传性的
        //final override 可以关闭override的遗传性
    }
}