package com.huynhhoapy97;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int a[] = new int[n];
        n--;

        int[] b = new int[]{};
        System.out.println(b.length);

        b = a;
        System.out.println(b.length);

        int[] c = new int[]{1,2,3};
        int[] d;
        d = c;
        System.out.println(d[1]);
    }
}
