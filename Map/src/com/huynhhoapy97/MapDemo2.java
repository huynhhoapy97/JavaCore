package com.huynhhoapy97;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap_1 = new TreeMap<>();
        treeMap_1.put("mot", "Hoa");
        treeMap_1.put("ba", "Ngoc");
        treeMap_1.put("hai", "Duyen");

        for (Map.Entry<String, String> entry : treeMap_1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("----------------------------------");

        TreeMap<String, String> treeMap_2 = new TreeMap<>();
        treeMap_2.put("3", "Hoa");
        treeMap_2.put("1", "Ngoc");
        treeMap_2.put("2", "Duyen");

        for (Map.Entry<String, String> entry : treeMap_2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("----------------------------------");

        TreeMap<String, String> treeMap_3 = new TreeMap<>();
        treeMap_3.put("mot", "Toi");
        treeMap_3.put("hai", "la");
        treeMap_3.put("ba", "toi");

        for (String key : treeMap_3.keySet()) {
            System.out.println(key + ": " + treeMap_3.get(key));
        }
    }
}
