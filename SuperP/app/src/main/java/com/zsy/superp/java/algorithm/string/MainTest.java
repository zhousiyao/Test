package com.zsy.superp.java.algorithm.string;

import org.junit.Test;

public class MainTest {

    @Test
    public void start(){
        String aa = "123xabc";
        char[] str = aa.toCharArray();
        int start = 0;
        int end = str.length-1;
        while (start < end){
//            char t = str[start];
//            str[start] = str[end];
//            str[end] = t;
            str[start] = (char) (str[start] ^ str[end]);
            str[end] = (char) (str[start] ^ str[end]);
            str[start] = (char) (str[end] ^ str[start]);

            start++;
            end--;
        }
        System.out.println(String.valueOf(str));

    }
}
