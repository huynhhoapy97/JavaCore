package com.huynhhoapy97;

import com.huynhhoapy97.models.Staff;
import com.huynhhoapy97.models.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Teacher teacher_1 = new Teacher(3, "Hoa");
        Teacher teacher_2 = new Teacher(1, "Duyen");
        Teacher teacher_3 = new Teacher(2, "Ngoc");

        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(teacher_1);
        arrayList.add(teacher_2);
        arrayList.add(teacher_3);

        System.out.println("List before sort: ");
        for (Teacher arrayListElement : arrayList) {
            System.out.println(arrayListElement);
        }

        System.out.println("List after sorted: ");
        Collections.sort(arrayList);

        for (Teacher arrayListElement : arrayList) {
            System.out.println(arrayListElement);
        }
    }
}
