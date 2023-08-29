package com.huynhhoapy97;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        testWithKeyString();
    }

    private static void testWithPrimitiveData() {
        HashMap<Integer, String> hashMap_1 = new HashMap<>();
        hashMap_1.put(1, "Hoa");
        hashMap_1.put(1, "Duyen");
        hashMap_1.put(1, "Ngoc");

        for (Map.Entry<Integer, String> entry : hashMap_1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("------------------------------------------");

        HashMap<Integer, String> hashMap_2 = new HashMap<>();
        hashMap_2.put(2, "Hoa");
        hashMap_2.put(1, "Duyen");
        hashMap_2.put(3, "Ngoc");

        for (Map.Entry<Integer, String> entry : hashMap_2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("------------------------------------------");

        HashMap<Integer, String> hashMap_3 = new HashMap<>();
        hashMap_3.put(null, null);
        hashMap_3.put(2, null);
        hashMap_3.put(1, null);

        for (Map.Entry<Integer, String> entry : hashMap_3.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void testWithKeyString() {
        HashMap<String, String> hashMap_1 = new HashMap<>();
        hashMap_1.put("ba", "Hoa");
        hashMap_1.put("mot", "Duyen");
        hashMap_1.put("hai", "Ngoc");

        for (Map.Entry<String, String> entry : hashMap_1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
