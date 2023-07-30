package com.huynhhoapy97;

public class Main {
    public static void main(String[] args) {
        /**
         * Case 1
         */
        String s1 = "HoaTruong";
        String s2 = "HoaTruong";

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        /**
         * Case 2
         */
        String s3 = new String("HoaTruong");
        String s4 = new String("HoaTruong");

        if (s3 == s4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        /**
         * Case 3
         */
        String s5 = new String("HoaTruong");
        String s6 = s5;

        if (s5 == s6) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
