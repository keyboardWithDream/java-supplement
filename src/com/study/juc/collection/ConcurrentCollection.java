package com.study.juc.collection;


import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 集合类不安全
 * @Author Harlan
 * @Date 2020/11/15
 */
public class ConcurrentCollection {

    public static void main(String[] args) throws InterruptedException {
        //并发安全List
        List<String> list = new CopyOnWriteArrayList<>();
        //并发安全Map
        Map<String, String> map = new ConcurrentHashMap<>(0);
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
                System.out.println(map);
            }, String.valueOf(i)).start();
        }
        Thread.sleep(1000);
        System.out.println(list);
        System.out.println(map);
    }
}
