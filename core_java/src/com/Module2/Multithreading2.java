package com.Module2.copy;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running by extending Thread class.");
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

