package com.huynhhoapy97;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount rows:");
        int amountRows = scanner.nextInt();
        System.out.println("Input amount columns:");
        int amountColumns = scanner.nextInt();

        drawShape_1(amountRows, amountColumns);
        System.out.println("----------------");
        drawShape_2(amountRows);
        System.out.println("----------------");
        drawShape_3(amountRows, amountColumns);
        System.out.println("----------------");
        drawShape_4(amountRows, amountColumns);
    }

    private static void drawShape_1(int amountRows, int amountColumns) {
        for (int i = 0; i < amountRows; i++) {
            for (int j = i; j < amountColumns; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
            //System.out.println();
        }
    }

    private static void drawShape_2(int amountRows) {
        for (int i = 0; i < amountRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    private static void drawShape_3(int amountRows, int amountColumns) {
        for (int i = amountRows; i >= 1; i--) {
            for (int j = 1; j <= amountColumns; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }

    private static void drawShape_4(int amountRows, int amountColumns) {
        for (int i = 1; i <= amountRows; i++) {
            for (int j = 1; j <= amountColumns; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
