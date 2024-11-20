package com.Module2.copy;

public class String12 {
    void printn(int n) {
        System.out.println("Integer: " + n);
    }

    void printn(char c) {
        System.out.println("Character: " + c);
    }

    void printn(double d) {
        System.out.println("Double: " + d);
    }

    public static void main(String[] args) {
        String12 obj = new String12();
        
        obj.printn(10);
        obj.printn('A');
        obj.printn(10.5);
    }
}
