package com.study.pattern.singleton;

/**
 * @Author Harlan
 * @Date 2020/11/10
 */
public class Singleton1 {

    /**
     * 自行创建
     */
    public static final Singleton1 INSTANCE = new Singleton1();

    /**
     * 构造器私有化
     */
    private Singleton1(){}

}
