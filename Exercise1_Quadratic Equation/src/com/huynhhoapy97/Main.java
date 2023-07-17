package com.huynhhoapy97;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please input the coefficient \"a\":");
            double a = scanner.nextDouble();
            System.out.println("Please input the coefficient \"b\":");
            double b = scanner.nextDouble();
            System.out.println("Please input the coefficient \"c\":");
            double c = scanner.nextDouble();

            executeQuadraticEquation(a, b, c);

            if (!isContinuousExecution()) {
                break;
            }
        } while (true);
    }

    /**
     * ax + b = 0
     *
     * @param a - the first coefficient
     * @param b - the second coefficient
     */
    private static void executeLinearEquation(double a, double b) {
        System.out.println("*** LINEAR EQUATION ***");
        if (a == 0 && b == 0) {
            System.out.println("The equation has infinitely many solutions.");
        } else if (a == 0 && b != 0) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("The equation has one solution: x = " + (-b / a));
        }
    }

    /**
     * ax^2 + bx + c = 0
     *
     * @param a - the first coefficient
     * @param b - the second coefficient
     * @param c - the third coefficient
     */
    public static void executeQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            executeLinearEquation(b, c);
        } else {
            System.out.println("*** QUADRATIC SOLUTION ***");
            double delta = (b * b) - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no solution.");
            } else if (delta == 0) {
                System.out.println("The equation has two identical solutions: x1 = x2 = " + (-b / (2 * a)));
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct solutions: x1 = " + x1 + "; x2 = " + x2);
            }
        }
    }

    private static boolean isContinuousExecution() {
        System.out.println("Do you wanna continue? y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        do {
            switch (answer) {
                case "y":
                case "Y":
                    return true;
                case "n":
                case "N":
                    return false;
                default:
                    System.out.println("Please input one character y(Yes) or n(No):");
                    answer = scanner.nextLine();
            }
        } while (true);
    }
}
