package com.zsy.basic.symbol

class DataType {

    var number: Int = 1 // ðè¿æ Double Float Long Short Byte é½ç±»ä¼¼
    var c: Char = 'c'
    var b: Boolean = true
    var array: IntArray = intArrayOf(1, 2) // ðç±»ä¼¼çè¿æ FloatArray DoubleArray CharArray ç­ï¼intArrayOf æ¯ Kotlin ç built-in å½æ°
    var str: String = "string"

    //âï¸
    //int a = 1;
    //Integer b = 2; // ðä¼è¢«èªå¨è£ç®± autoboxing

    //ðï¸
    var ta: Int = 1 // unbox   (æ§è½å¼éæ´å° ï¼ æ¨èï¼)
    var tb: Int? = 2 // box
    var list: List<Int> = listOf(1, 2) // box



    //æ°ç»
    var array2:IntArray = intArrayOf(1,2,3,4) // unbox (æ§è½å¼éæ´å° ï¼ æ¨èï¼)
}