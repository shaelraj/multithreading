package com.javamonks.oldstyle;

import static java.lang.Thread.sleep;

public class ThreadExampleMain {
    public static void main(String[] args){
        /*MyThread t = new MyThread(); // first way
        */
//        MyRunnable runnable = new MyRunnable(); // second way

        Runnable runnable = new Runnable() {

            public void run() {
                for (int i=0; i<20;i++){
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("MyRunnable running...");
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        for (int i=0; i<20;i++){
            System.out.println("Main Thread ....");
        }
    }
}
