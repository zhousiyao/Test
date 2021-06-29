package com.zsy.superp.java.algorithm.sort;

import org.junit.Test;

public class Sort {

    @Test
    public void main (){
        int[] arr = new int[]{3,1,14,2,9,35,7,21};
//        mpSort(arr);
        quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.print(i + " > ");
        }
    }

    public static void mpSort(int[] arr){

        for (int i = 0;i< arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]< arr[j]){
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }

    public static void quickSort(int[] arr,int start, int end){

        if(start > end){
            return;
        }
        int i = start;
        int j = end;
        int k = arr[start];
        while (i<j){
            while (k <= arr[j] && i<j){
                j--;
            }
            while (k >= arr[i] && i<j){
                i++;
            }
            if (i<j){
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        //将基准数放到中间位
        arr[start] = arr[i];
        arr[i] = k;
        //递归基准数左侧数组
        quickSort(arr,start,i-1);
        //递归基准数右侧数组
        quickSort(arr,j+1,end);

    }
}
