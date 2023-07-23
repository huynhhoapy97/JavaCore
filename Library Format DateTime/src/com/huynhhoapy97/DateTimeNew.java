package com.huynhhoapy97;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeNew {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        System.out.println(String.format("date: %d, month: %d, year: %d", day, month, year));

        Month monthObj = localDate.getMonth();
        System.out.println("month got from class Month: " + monthObj.getValue());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a")));
    }
}
