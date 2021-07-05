package com.zsy.basic.symbol

class DataType {

    var number: Int = 1 // 👈还有 Double Float Long Short Byte 都类似
    var c: Char = 'c'
    var b: Boolean = true
    var array: IntArray = intArrayOf(1, 2) // 👈类似的还有 FloatArray DoubleArray CharArray 等，intArrayOf 是 Kotlin 的 built-in 函数
    var str: String = "string"

    //☕️
    //int a = 1;
    //Integer b = 2; // 👈会被自动装箱 autoboxing

    //🏝️
    var ta: Int = 1 // unbox   (性能开销更小 ： 推荐！)
    var tb: Int? = 2 // box
    var list: List<Int> = listOf(1, 2) // box



    //数组
    var array2:IntArray = intArrayOf(1,2,3,4) // unbox (性能开销更小 ： 推荐！)
}