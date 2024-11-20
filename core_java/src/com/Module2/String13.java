package com.Module2.copy;

public class String13 {
    void printn(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    void printn(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
        String13 obj = new String13();
        
        obj.printn(10, 'A');
        obj.printn('A', 10);
    }
}
