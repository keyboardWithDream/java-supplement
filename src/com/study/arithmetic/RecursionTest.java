package com.study.arithmetic;

import org.junit.Test;

/**
 * 递归：有n步台阶，一次只能上1步或2步，共有多少中走法？
 * @Author Harlan
 * @Date 2020/11/13
 */
public class RecursionTest {

    /**
     * 最小步数2（1也是）
     */
    int minStep = 2;

    public int f(int n){
        if (n < 1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n == 1 || n == minStep){
            return n;
        }
        return f(n - 2) + f(n - 1);
    }

    @Test
    public void test(){
        System.out.println(f(10));
    }
}
