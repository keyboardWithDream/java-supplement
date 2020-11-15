package com.study.passvalue;

import java.util.Arrays;

/**
 * 参数传递机制
 * @Author Harlan
 * @Date 2020/11/13
 */
public class Code {

    public static void main(String[] args) {
        int i = 1;
        String str = "Hello";
        Integer num = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyData myData = new MyData();
        change(i, str, num, arr, myData);
        System.out.println(i);
        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(myData.a);
    }

    /**
     * 参数传递
     * @param j int
     * @param s String
     * @param n Integer
     * @param a Array
     * @param m MyData
     */
    public static void change(int j, String s, Integer n, int[] a, MyData m){
        j += 1;
        s += "World";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
}

class MyData{
    int a = 10;
}
