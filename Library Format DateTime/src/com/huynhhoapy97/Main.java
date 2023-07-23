package com.huynhhoapy97;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Class contains current date and time of OS System
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(String.format("date: %d, month: %d, year: %d", day, month + 1, year));

        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String datePattern = "dd/MM/yyyy";
        simpleDateFormat.applyPattern(datePattern);

        System.out.println(simpleDateFormat.format(date));

        String dateTimePattern = "dd/MM/yyyy HH:mm:ss";
        simpleDateFormat.applyPattern(dateTimePattern);

        System.out.println(simpleDateFormat.format(date));
    }
}
