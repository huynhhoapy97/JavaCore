package com.huynhhoapy97;

public class ExerciseOne {
    /*
     * 1. Viet mot ham co doi so truyen vao la mot chuoi bat ky. Hay viet lenh de xuat ra cac so nguyen am trong chuoi
       VD: nhap vao chuoi "abc-5xyz-12k91--p"
       thi ham xuat ra hai so nguyen am la -5 va -12

     *  abc-5xyz-12-113k-91--p
     */
    public static void main(String[] args) {
        String s = "abc-5xyz-12-113k-91--p";
        StringBuilder result = new StringBuilder();
        String regex = "\\d";

        char[] array = s.toCharArray();
        int i = 0;
        while (i < array.length) {
            if (array[i] == '-') {
                StringBuilder stringBuilder = new StringBuilder("-");
                int j = i + 1;
                while (true) {
                    if (String.valueOf(array[j]).matches(regex)) {
                        stringBuilder.append(array[j]);
                        j++;
                    } else {
                        i = j;
                        break;
                    }
                }
                if (!stringBuilder.toString().equals("-")) {
                    result.append(stringBuilder);
                    result.append(";");
                }
            } else {
                i++;
            }
        }

        if (!result.toString().isEmpty()) {
            String[] arrayResult = result.toString().split(";");
            System.out.println("We have " + arrayResult.length + " numbers: ");
            for (String resultEntity : arrayResult) {
                System.out.println(resultEntity);
            }
        }
    }
}
