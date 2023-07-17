package com.huynhhoapy97;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input \"x\" value:");
        int x = scanner.nextInt();
        System.out.println("Please input \"n\" value:");
        int n = scanner.nextInt();

        double sumResult_Case1 = calculateSumExpressionMath_Case1(x, n);
        double sumResult_Case2 = calculateSumExpressionMath_Case2(x, n);
        System.out.println("Result_1: " + sumResult_Case1);
        System.out.println("Result_2: " + sumResult_Case2);
    }

    /**
     * S(x,n) = x + x^2 / (1 + 2) + x^3 / (1 + 2 + 3) + ... + x^n / (1 + 2 +3 + ... + n)
     *
     * @param x
     * @param n
     * @return
     */
    private static double calculateSumExpressionMath_Case1(int x, int n) {
        double sumResult = 0;
        for (int i = 1; i <= n; i++) {
            double numerator = Math.pow(x, i);
            double denominator = 0;
            for (int j = 1; j <= i; j++) {
                denominator += j;
            }

            double fraction = numerator / denominator;
            sumResult += fraction;
        }

        return sumResult;
    }

    private static double calculateSumExpressionMath_Case2(int x, int n) {
        double sumResult = 0;
        double denominator = 0;
        for (int i = 1; i <= n; i++) {
            double numerator = Math.pow(x, i);
            denominator += i;
            double fraction = numerator / denominator;
            sumResult += fraction;
        }

        return sumResult;
    }
}
