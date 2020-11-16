package com.study.juc.lock.eg;

import java.util.concurrent.TimeUnit;

/**
 * @Author Harlan
 * @Date 2020/11/16
 */
public class LockEg {

    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();


        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "A").start();


        new Thread(() -> {
            try {
                phone.sendMsg();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                phone.sayHello();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        TimeUnit.SECONDS.sleep(5);

        new Thread(() -> {
            try {
                Phone.sayWorld();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

}

/**
 * 资源类
 */
class Phone {

    public synchronized void sendEmail() throws Exception {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("sendEmail");
    }

    public synchronized void sendMsg() throws Exception {
        System.out.println("sendMsg");
    }

    public static synchronized void sayWorld() throws Exception {
        System.out.println("sayWorld");
    }

    public void sayHello() throws Exception {
        System.out.println("sayHello");
    }
}