package com.huynhhoapy97;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        formatForScore();
        formatForMoney();
        formatForMoneyForeign();
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
        DecimalFormat decimalFormat = new DecimalFormat("#,### VND");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        //decimalFormatSymbols.setGroupingSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        System.out.println("Money after format: " + decimalFormat.format(money));
    }

    /*
     *  Tạo một đối tượng đại diện cho Locale để lưu trữ thông tin vị trí địa lý
     *  Tạo một pattern để đặt định dạng cho số,
        ở đây cứ 3 số nguyên sẽ được ngăn cách bằng 1 dấu phẩy,
        phần thập phân và phần nguyên được ngăn cách bởi dấu chấm,
        lưu ý rằng phần nguyên số chữ số là không cố định,
        tức là dù có khai báo là 6 dấu "#" ở phần nguyên,
        nhưng vẫn có thể xử lý một số có phần nguyên là 4 hoặc 8 chữ số,
        nhưng ở phần thập phân thì sẽ được làm tròn đến đúng với số lượng dấu #
     */
    private static void formatForMoneyForeign() {
        double money = 4337.574646265748567;
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        System.out.println("Money after format: " + decimalFormat.format(money));
    }
}
