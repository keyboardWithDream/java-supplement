package com.study.pattern.singleton;

/**
 * @Author Harlan
 * @Date 2020/11/10
 */
public class Singleton3 {

    public static final Singleton3 INSTANCE;

    static {
        INSTANCE = new Singleton3();
    }

    private Singleton3(){}
}
