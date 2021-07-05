package com.zsy.basic.static

class StaticClass {

    fun main(){
        ObjectClass.mName()
        PartStaticClass.PartObjectClass.mObject()
        PartStaticClass2.mObject()
    }

}

//全静态
//静态类（内部所有成员和函数都是静态的）
object ObjectClass{
    val name :String = "xiaozhou"
    fun mName(){

    }
}

//部分静态
class PartStaticClass{
    val fClass = "全局成员"

    object PartObjectClass{
        val fObject = "部分静态类成员"
        fun mObject(){}
    }

}

//部分静态
//不需要定义静态内部类的名字（可以直接用类名.来调用）
//companion object(实际静态内部类的名称就是 Companion)
//companion object内部声明的 除函数意外其他都属于PartStaticClass2的成员
class PartStaticClass2{

    companion object{
        val fObject = "没名字的静态内部类成员"
        var fVariable = "Companion Object Variable"

        fun mObject(){}
    }
}