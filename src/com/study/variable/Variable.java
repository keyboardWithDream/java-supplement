package com.study.variable;

/**
 * 成员变量与局部变量
 * @Author Harlan
 * @Date 2020/11/13
 */
public class Variable {

    static int s;
    int i;
    int j;

    {
        int i = 1;
        i ++;
        j ++;
        s ++;
    }

    public void test(int j){
        i ++;
        j ++;
        s ++;
    }

    public static void main(String[] args){
        Variable v1 = new Variable();
        Variable v2 = new Variable();
        v1.test(10);
        v1.test(20);
        v2.test(30);
        System.out.println(v1.i + ", " + v1.j + ", " + Variable.s);
        System.out.println(v2.i + ", " + v2.j + ", " + Variable.s);
    }
}
