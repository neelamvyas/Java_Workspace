package com.Module2.copy;

class MyThreadWithSleep extends Thread {
    private String threadName;

    MyThreadWithSleep(String name) {
        threadName = name;
    }

    public void run() {
        try {
            System.out.println(threadName + " is running.");
            Thread.sleep(2000); // Sleep for 2000ms (2 seconds)
            System.out.println(threadName + " has finished execution.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Multithreading3 {
    public static void main(String[] args) {
        MyThreadWithSleep t1 = new MyThreadWithSleep("Thread 1");
        MyThreadWithSleep t2 = new MyThreadWithSleep("Thread 2");
        
        t1.start(); // Start Thread 1
        t2.start(); // Start Thread 2
    }
}

