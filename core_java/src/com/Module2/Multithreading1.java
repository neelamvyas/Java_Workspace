package com.Module2.copy;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable Interface.");
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
       
}
}
   
