package com.javamonks.oldstyle;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable {
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
}
