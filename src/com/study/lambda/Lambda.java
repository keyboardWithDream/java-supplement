package com.study.lambda;

/**
 * 函数式接口有切仅有一个方法
 * @Author Harlan
 * @Date 2020/11/15
 */
public class Lambda {

    public static void main(String[] args) {
        Hello hello = (String name) -> { return "Hello!" + name; };
        String str = hello.sayHello("Harlan");
        int i = hello.add(1,1);
        int j = Hello.mul(2,2);
        System.out.println(str + "-" + i + "-" + j);
    }
}

@FunctionalInterface
interface Hello{

    /**
     * sayHello
     * @param name 名字
     * @return Hello + name
     */
    String sayHello(String name);

    /**
     * add
     * @param x x
     * @param y y
     * @return x + y
     */
    default int add(int x, int y) {
        return x + y;
    }

    /**
     * mul
     * @param x x
     * @param y y
     * @return x * y
     */
    static int mul(int x, int y){
        return x * y;
    }
}
