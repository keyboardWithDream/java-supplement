package com.study.arithmetic;

import org.junit.Test;

/**
 * 循环迭代：有n步台阶，一次只能上1步或2步，共有多少中走法？
 * @Author Harlan
 * @Date 2020/11/13
 */
public class LoopIterationTest {

    /**
     * 最小步数2（1也是）
     */
    int minStep = 2;

    /**
     * 计算走法
     * @param n 多少步台阶
     * @return 走法
     */
    public int loop(int n){
        if (n < 1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n == 1 || n == minStep) {
            return n;
        }
        //初始化走到第二级台阶的走法
        int one = 2;
        //初始化走到第一级台阶的走法
        int two = 1;
        //初始化结果
        int res = 0;
        for (int i = 3; i <= n; i++) {
            //最后跨两步+最后跨一步的走法
            res = two + one;
            two = one;
            one = res;
        }
        return res;
    }

    @Test
    public void test(){
        System.out.println(loop(10));
    }
}
