package com.javamonks.oldstyle;

public class MyThread extends Thread {
    public void run() {
        for (int i=0; i<20;i++){
            System.out.println("Thread : " + i);
        }
    }
}
