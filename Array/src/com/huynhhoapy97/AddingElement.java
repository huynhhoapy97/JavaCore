package com.huynhhoapy97;

public class AddingElement {
    public static void main(String[] args) {
        int[] array = new int[6];
        System.out.println("Initial Array: ");
        for (int a : array) {
            System.out.print(a);
            System.out.print("\t");
        }

        int addingElement = 86;
        int addingPosition = 2;
        int length = array.length;

        addElement(array, length, addingElement, addingPosition);
    }


    private static void addElement(int[] array, int length, int addingElement, int addingPosition) {
        System.out.println("length: " + array.length);

        for (int i = length - 1; i >= addingPosition; i--) {
            array[i + 1] = array[i];
        }
        array[addingPosition] = addingElement;
        length++;

        System.out.println("After Adding Array: ");
        for (int a : array) {
            System.out.print(a);
            System.out.print("\t");
        }
    }
}
