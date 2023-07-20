package com.huynhhoapy97;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input positive integer a: ");
        int a = scanner.nextInt();
        System.out.println("Input positive integer b: ");
        int b = scanner.nextInt();

        int greatestCommonDivisor = findGreatestCommonDivisor(a, b);
        System.out.println("greatest common divisor of " + a + " and " + b + " is " + greatestCommonDivisor);

        alertPerfectNumber(a);
        alertPerfectNumber(b);

        alertAllEvenNumberInEachNumber(a);
        alertAllEvenNumberInEachNumber(b);

        double sum = executeMath(a, b);
        System.out.println("Sum(" + a + "," + b + ") = " + sum);
    }

    /**
     * Tìm ước số chung lón nhất của 2 số nguyên dương a,b
     * Find greatest common divisor of 2 positive integer numbers
     *
     * @param a - positive integer a
     * @param b - positive integer b
     * @return
     */
    private static int findGreatestCommonDivisor(int a, int b) {
        int minPositiveInteger = Math.min(a, b);
        int commonDivisor = 1;

        for (int i = 2; i <= minPositiveInteger; i++) {
            if (a % i == 0 && b % i == 0) {
                commonDivisor = i;
            }
        }

        return commonDivisor;
    }

    /**
     * Kiểm tra số nguyên dương n có phải là số hoàn thiện hay không?
     * (Số hoàn thiện là số có tổng các ước số của nó (không kể nó) thì bằng chính nó.
     * VD: 6 có các ước số là 1,2,3 và 6 = 1 + 2 + 3 => 6 là số hoàn thiện)
     *
     * @param number - checking number
     * @return
     */
    private static boolean checkPerfectNumber(int number) {
        int sumCommonDivisor = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumCommonDivisor += i;
            }
        }

        return number == sumCommonDivisor;
    }

    public static void alertPerfectNumber(int number) {
        if (checkPerfectNumber(number)) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }

    /**
     * Kiểm tra số nguyên dương n có các chữ số toàn là chữ số chẵn hay không? VD: 2468
     *
     * @param number - checking number
     * @return
     */
    private static boolean checkAllEvenNumberInEachNumber(int number) {
        int quotient;
        int remainder;
        int temp = number;

        do {
            quotient = temp / 10;
            remainder = temp % 10;
            temp = quotient;

            if (remainder % 2 != 0) {
                return false;
            }
        } while (quotient > 0);

        return true;
    }

    public static void alertAllEvenNumberInEachNumber(int number) {
        if (checkAllEvenNumberInEachNumber(number)) {
            System.out.println(number + " has all even number");
        } else {
            System.out.println(number + " has not all even number");
        }
    }

    /**
     * S(x,n) = x + x^3/3! + x^5/5! + ... + x^2n+1/(2n + 1)!
     *
     * @return
     */
    private static double executeMath(int x, int n) {
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            double numerator = Math.pow(x, (2 * i) + 1);
            double denominator = calculateFactorialNumber((2 * i) + 1);
            sum += numerator / denominator;
        }

        return sum;
    }

    private static int calculateFactorialNumber(int number) {
        int factorialNumber = 1;
        for (int i = 2; i <= number; i++) {
            factorialNumber *= i;
        }

        return factorialNumber;
    }
}
