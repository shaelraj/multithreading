package com.javamonks.executorservice;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {
    public static void main(String[] args) {
        Instant startTime = Instant.now();
        System.out.println("Start Time :" + startTime);
       /* Thread thread1 = new Thread(new ThreadNamePrinter());
        thread1.start();
        Thread thread2 = new Thread(new ThreadNamePrinter());
        thread2.start();
        Thread thread3 = new Thread(new ThreadNamePrinter());
        thread3.start();*/

        ExecutorService executor = Executors.newFixedThreadPool(3);
        ThreadNamePrinter printer = new ThreadNamePrinter();
        for(int i = 0; i <3;i++){
            executor.submit(printer);
        }

        executor.shutdown();
    }
}
