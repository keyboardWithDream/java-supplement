package com.study.juc.eg;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个售票员，卖出30张票
 * 资源类：实例变量+实例方法
 */
class Ticket {

    private int num = 10000;
    /**
     * 可重复锁
     */
    Lock lock = new ReentrantLock();

    public void sale(){
        lock.lock();
        try{
            if (num > 0){
                System.out.println(Thread.currentThread().getName() + "\t卖出" + (num--) + "张票,还剩下" + num + "张");
            }
        }finally {
            lock.unlock();
        }
    }
}

/**
 * @author 13536
 */
public class SaleTicket {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(() -> { for (int i = 0; i < 100000; i++) ticket.sale();}, "A").start();

        new Thread(() -> { for (int i = 0; i < 100000; i++) ticket.sale();}, "B").start();

        new Thread(() -> { for (int i = 0; i < 100000; i++) ticket.sale();}, "C").start();
    }
}
