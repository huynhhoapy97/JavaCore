package com.huynhhoapy97;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //formatForScore();
        formatForMoney();
    }

    private static void formatForScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Math score: ");
        double mathScore = scanner.nextDouble();
        System.out.println("Input Physic score: ");
        double physicScore = scanner.nextDouble();
        System.out.println("Input Chemistry score: ");
        double chemistryScore = scanner.nextDouble();

        double abs = (mathScore + physicScore + chemistryScore) / 3;
        System.out.println("Score of 3 subjects: " + abs);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Score of 3 subjects after format: " + decimalFormat.format(abs));
    }

    /*
        Format phan nghin tu phai sang trai
     */
    private static void formatForMoney() {
        int money = 1500321000;
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        //decimalFormatSymbols.setGroupingSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        System.out.println("Money after format: " + decimalFormat.format(money));
    }
}
