package com.Module2.copy;

class TestDaemonThread2 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running.");
        } else {
            System.out.println("User thread is running.");
        }
    }
}

public class Multithreading5 {
    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2(); // Daemon thread
        TestDaemonThread2 t2 = new TestDaemonThread2(); // User thread
        
        t1.setDaemon(true); // Set t1 as daemon before start
        t1.start();
        t2.start();
         
   }
}

