package com.Module2.copy;

class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Multithreading4 {
    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        try {
            t1.start(); // This will throw an IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot start the same thread twice.");
        }
    }
}
