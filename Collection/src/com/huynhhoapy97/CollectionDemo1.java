package com.huynhhoapy97;

import com.huynhhoapy97.models.Staff;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        testObjectDataType();
    }

    private static void testPrimitiveDataType() {
        // Kiem tra thu tu cac phan tu duoc luu vao ArrayList va HashSet
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hoa");
        arrayList.add("dep");
        arrayList.add("trai");
        arrayList.add("dep");

        HashSet<String> hashSetList = new HashSet<String>();
        hashSetList.add("Hao");
        hashSetList.add("hoa");
        hashSetList.add("lang");
        hashSetList.add("tu");
        hashSetList.add("hoa");

        System.out.println("Size of ArrayList: " + arrayList.size());
        for (String arrayListElement : arrayList) {
            System.out.println(arrayListElement);
        }

        System.out.println("------------------------------");

        System.out.println("Size of HashSetList: " + hashSetList.size());
        for (String hashSetListElement : hashSetList) {
            System.out.println(hashSetListElement);
        }
    }

    private static void testObjectDataType() {
        // Kiem tra thu tu cac phan tu duoc luu vao ArrayList va HashSet

        Staff staff_1 = new Staff("Hoa", 26);
        Staff staff_2 = new Staff("Duyen", 18);
        Staff staff_3 = new Staff("Duyen", 18);

        ArrayList<Staff> arrayList = new ArrayList<Staff>();
        arrayList.add(staff_1);
        arrayList.add(staff_2);
        arrayList.add(staff_3);
        arrayList.add(null);

        HashSet<Staff> hashSetList = new HashSet<Staff>();
        hashSetList.add(staff_1);
        hashSetList.add(staff_2);
        hashSetList.add(staff_3);
        hashSetList.add(null);

        System.out.println("Size of ArrayList: " + arrayList.size());
        for (Staff arrayListElement : arrayList) {
            System.out.println(arrayListElement);
        }

        System.out.println("------------------------------");

        System.out.println("Size of HashSetList: " + hashSetList.size());
        for (Staff hashSetListElement : hashSetList) {
            System.out.println(hashSetListElement);
        }
    }

    private static void testPrimitiveDataType_2() {
        // Kiem tra thu tu cac phan tu duoc luu vao ArrayList va HashSet
        String s1 = new String("Hoa");
        String s2 = new String("Duyen");
        String s3 = new String("Duyen");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        HashSet<String> hashSetList = new HashSet<String>();
        hashSetList.add(s1);
        hashSetList.add(s2);
        hashSetList.add(s3);

        System.out.println("Size of ArrayList: " + arrayList.size());
        for (String arrayListElement : arrayList) {
            System.out.println(arrayListElement);
        }

        System.out.println("------------------------------");

        System.out.println("Size of HashSetList: " + hashSetList.size());
        for (String hashSetListElement : hashSetList) {
            System.out.println(hashSetListElement);
        }
    }
}
