package com.zsy.basic.set

class KotlinSet {

    val strList:List<String> = listOf("a","bb","ccc")
    val strSet:Set<String> = setOf("q1","q2","q3")
    val strMap:Map<String,Int> = mapOf("A" to 2, "B" to 123)

    val strMList:MutableList<String> = mutableListOf("1","2")

    fun setMain(){
        strMList.add("new Strign")
    }


    //Kotlin 数组和集合的区别
    //因为 数组是 “不支持自动拆装箱的”所以数组性能更好， 集合的功能更多

}