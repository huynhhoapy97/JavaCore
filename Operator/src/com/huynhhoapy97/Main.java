package com.huynhhoapy97;

public class Main {
    public static void main(String args[]){
        int x = 8;
        int y = 2;
        int k = 3;
        int z = --k - ++x - y++ + 2;

        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("k = " + k);

        int a = 5;
        int b = 2;
        String result = (a % b == 0) ? "a is even number" : "a is odd number";
        System.out.println(result);
    }
}
