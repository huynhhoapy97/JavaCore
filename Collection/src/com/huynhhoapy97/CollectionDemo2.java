package com.huynhhoapy97;

import com.huynhhoapy97.models.Student;
import com.huynhhoapy97.models.StudentIDComparator;

import java.util.TreeSet;

public class CollectionDemo2 {
    public static void main(String[] args) {
        testObjectDataType_2();
    }

    private static void testPrimitiveDataType() {
        TreeSet<String> treeSetList = new TreeSet<String>();
        treeSetList.add("toi");
        treeSetList.add("la");
        treeSetList.add("toi");
        treeSetList.add("string_3");
        treeSetList.add("string_1");
        treeSetList.add("string_2");
        //treeSetList.add(null);

        for (String treeSetListElement : treeSetList) {
            System.out.println(treeSetListElement);
        }
    }

    private static void testPrimitiveDataType_2() {
        TreeSet<Integer> treeSetList = new TreeSet<Integer>();
        treeSetList.add(5);
        treeSetList.add(3);
        treeSetList.add(11);
        treeSetList.add(21);
        treeSetList.add(9);

        for (int treeSetListElement : treeSetList) {
            System.out.println(treeSetListElement);
        }
    }

    private static void testPrimitiveDataType_3() {
        TreeSet<Character> treeSetList = new TreeSet<Character>();
        treeSetList.add('H');
        treeSetList.add('O');
        treeSetList.add('A');
        treeSetList.add('0');
        treeSetList.add('K');

        for (char treeSetListElement : treeSetList) {
            System.out.println(treeSetListElement);
        }
    }

    private static void testObjectDataType() {
        Student student_1 = new Student(1, "name_9");
        Student student_2 = new Student(2, "name_1");
        Student student_3 = new Student(3, "name_7");

        TreeSet<Student> treeSetList = new TreeSet<Student>();
        treeSetList.add(student_1);
        treeSetList.add(student_2);
        treeSetList.add(student_3);

        for (Student treeSetListElement : treeSetList) {
            System.out.println(treeSetListElement);
        }
    }

    private static void testObjectDataType_2() {
        Student teacher_1 = new Student(1, "name_9");
        Student teacher_2 = new Student(2, "name_1");
        Student teacher_3 = new Student(3, "name_7");

        TreeSet<Student> treeSetList = new TreeSet<Student>(new StudentIDComparator());
        treeSetList.add(teacher_1);
        treeSetList.add(teacher_2);
        treeSetList.add(teacher_3);

        for (Student treeSetListElement : treeSetList) {
            System.out.println(treeSetListElement);
        }
    }
}
