package com.huynhhoapy97;

import java.util.Arrays;

public class ArraysDemo2 {
    /*
     * MultiDimensional Array
     */
    public static void main(String[] args) {
        // 2 Dimensional Array
        int[][] a = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

        System.out.println("--------------------------------------");

        int[][] b = {
                {1, 2},
                {3, 4, 5, 6},
                {7}
        };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

        System.out.println("--------------------------------------");
        // Use for each to browse each element in multidimensional array

        int[][] c = {
                {-1, -3, 5},
                {2, 4, -6, 8},
                {7, 9}
        };

        for (int[] elementArray : c) {
            for (int element : elementArray) {
                System.out.print(element);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

        System.out.println("--------------------------------------");
        // 3 Dimensional Array

        int[][][] d = {
                {
                        {1, 8},
                        {14, 15, 18}
                },
                {
                        {23, 24},
                        {28, 29, 30}
                }
        };

        for (int[][] array2D : d) {
            for (int[] array1D : array2D) {
                for (int element : array1D) {
                    System.out.print(element);
                    System.out.print("\t");
                }
                System.out.print("\n");
            }
        }

        System.out.println("--------------------------------------");

        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(c));
        System.out.println(Arrays.deepToString(d));
    }
}
