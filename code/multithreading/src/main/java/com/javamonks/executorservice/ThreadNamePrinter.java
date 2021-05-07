package com.javamonks.executorservice;

import java.time.Instant;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class ThreadNamePrinter implements Runnable {
    public void run() {
        try {
            sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Job completed successfully. Thread name is :" + currentThread().getName());
        Instant endTime = Instant.now();
        System.out.println("End Time :" + endTime);
    }
}
