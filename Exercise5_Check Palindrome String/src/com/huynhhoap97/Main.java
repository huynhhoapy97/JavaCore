package com.huynhhoap97;

public class Main {
    public static void main(String[] args) {
        /**
         * GO HANG A SALAMI! I'M A LASAGNA HOG!
         * I did, did I?
         * no lemon, no melon
         * no x in Nixon
         * 02022020
         * don't nod
         */
        String regex = "[a-zA-Z0-9]";
        String s = "don't nod";
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (String.valueOf(c).matches(regex)) {
                stringBuilder.append(c);
            }
        }

        System.out.println(stringBuilder);

        boolean result = checkPalindrome(stringBuilder.toString());
        if (result) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is not Palindrome");
        }
    }

    /*
     *  xoa het nhung ky tu khong phai la ky tu chu
     *   so sanh ky tu dau vs ky tu cuoi, ky tu ke ky tu dau vs ky tu ke ky tu cuoi.... cu the cho den khi:
            vi tri ky tu so sanh ben trai > vi tri ky tu ben phai thi dung lai
            (*) vi tri ky tu so sanh ben trai = 0 -> length - 1
            (*) vi tri ky tu so sanh ben phai = length - 1 -> 0
     */
    private static boolean checkPalindrome(String s) {
        boolean isCheck = true;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = s.length() - 1 - i;

            if (left > right) {
                break;
            }
            if (!String.valueOf(s.charAt(left)).equalsIgnoreCase(String.valueOf(s.charAt(right)))) {
                isCheck = false;
                break;
            }
        }

        return isCheck;
    }
}
