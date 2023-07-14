package com.huynhhoapy97;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // If we input another data type (different Integer type) in this case, the exception will be raised
        System.out.println("Please input the variable within Integer type: ");
        int number_1 = scanner.nextInt();

        System.out.println("variable within Integer type: " + number_1);

        System.out.println("Please input the variable within Double type: ");
        double number_2 = scanner.nextDouble();

        System.out.println("variable within Double type: " + number_2);

        scanner.nextLine();

        System.out.println("Please input the variable within String type I: ");
        String number_3 = scanner.nextLine();

        System.out.println("variable within String type I: " + number_3);

        System.out.println("Please input the variable within String type II: ");
        String number_4 = scanner.nextLine();

        System.out.println("variable within String type II: " + number_4);

        System.out.println("Please input the variable within Float type: ");
        float number_5 = scanner.nextFloat();

        System.out.println("variable within Float type: " + number_5);
    }
}
