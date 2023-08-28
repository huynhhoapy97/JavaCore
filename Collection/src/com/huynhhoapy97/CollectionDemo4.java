package com.huynhhoapy97;

import com.huynhhoapy97.models.Teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        testAddAndUpdateElements();
    }

    private static void testElementsWithIterator() {
        Teacher teacher_1 = new Teacher(3, "Hoa");
        Teacher teacher_2 = new Teacher(1, "Duyen");
        Teacher teacher_3 = new Teacher(2, "Ngoc");

        Teacher teacher_4 = new Teacher(11, "Giac");
        Teacher teacher_5 = new Teacher(21, "Chanh");
        Teacher teacher_6 = new Teacher(31, "Dinh");

        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(teacher_1);
        arrayList.add(teacher_2);
        arrayList.add(teacher_3);

        System.out.println("----------- Iterator browses ArrayList -----------");
        Iterator<Teacher> iteratorList = arrayList.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());
        }

        HashSet<Teacher> hashSetList = new HashSet<>();
        hashSetList.add(teacher_4);
        hashSetList.add(teacher_5);
        hashSetList.add(teacher_6);

        System.out.println("----------- Iterator browses HashSet -----------");
        Iterator<Teacher> iteratorSet = hashSetList.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
        }
    }

    private static void testElementsWithListIterator() {
        Teacher teacher_1 = new Teacher(3, "Hoa");
        Teacher teacher_2 = new Teacher(1, "Duyen");
        Teacher teacher_3 = new Teacher(2, "Ngoc");

        Teacher teacher_4 = new Teacher(11, "Giac");
        Teacher teacher_5 = new Teacher(21, "Chanh");
        Teacher teacher_6 = new Teacher(31, "Dinh");

        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(teacher_1);
        arrayList.add(teacher_2);
        arrayList.add(teacher_3);

        System.out.println("----------- ListIterator browses ArrayList -----------");
        ListIterator<Teacher> listIteratorList = arrayList.listIterator();

        System.out.println("======== Begin to End ========");
        while (listIteratorList.hasNext()) {
            System.out.println(listIteratorList.next());
        }

        /*
            If we don't call method hashNext() first and do somethings then method hasPrevious won't work
         */
        System.out.println("======== End to Begin ========");
        while (listIteratorList.hasPrevious()) {
            System.out.println(listIteratorList.previous());
        }

        HashSet<Teacher> hashSetList = new HashSet<>();
        hashSetList.add(teacher_4);
        hashSetList.add(teacher_5);
        hashSetList.add(teacher_6);

        /*
            Không tồn tại phương thức listIterator() cho Set
         */
        //ListIterator<Teacher> listIteratorSet = hashSetList.listIterator();
    }

    private static void testRemoveElementsWithIterator() {
        Teacher teacher_1 = new Teacher(3, "Hoa");
        Teacher teacher_2 = new Teacher(1, "Duyen");
        Teacher teacher_3 = new Teacher(2, "Ngoc");

        Teacher teacher_4 = new Teacher(11, "Giac");
        Teacher teacher_5 = new Teacher(21, "Chanh");
        Teacher teacher_6 = new Teacher(31, "Dinh");

        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(teacher_1);
        arrayList.add(teacher_2);
        arrayList.add(teacher_3);

        System.out.println("----------- Iterator browses ArrayList -----------");
        Iterator<Teacher> iteratorList = arrayList.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());

            iteratorList.remove();
        }

        System.out.println("Size of arrayList: " + arrayList.size());

        HashSet<Teacher> hashSetList = new HashSet<>();
        hashSetList.add(teacher_4);
        hashSetList.add(teacher_5);
        hashSetList.add(teacher_6);

        System.out.println("----------- Iterator browses HashSet -----------");
        Iterator<Teacher> iteratorSet = hashSetList.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());

            iteratorSet.remove();
        }

        System.out.println("Size of hashSet: " + hashSetList.size());
    }

    private static void testRemoveElementsWithListIterator() {
        Teacher teacher_1 = new Teacher(3, "Hoa");
        Teacher teacher_2 = new Teacher(1, "Duyen");
        Teacher teacher_3 = new Teacher(2, "Ngoc");

        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(teacher_1);
        arrayList.add(teacher_2);
        arrayList.add(teacher_3);

        System.out.println("----------- ListIterator browses ArrayList -----------");
        ListIterator<Teacher> listIteratorList = arrayList.listIterator();
        while (listIteratorList.hasNext()) {
            System.out.println(listIteratorList.next());

            listIteratorList.remove();
        }

        /*while (listIteratorList.hasPrevious()) {
            System.out.println(listIteratorList.previous());
        }*/

        System.out.println("Size of arrayList: " + arrayList.size());
    }

    private static void testAddAndUpdateElements() {
        Teacher teacher_1 = new Teacher(3, "Hoa");
        Teacher teacher_2 = new Teacher(1, "Duyen");
        Teacher teacher_3 = new Teacher(2, "Ngoc");

        Teacher teacher_4 = new Teacher(11, "Giac");
        Teacher teacher_5 = new Teacher(21, "Chanh");
        Teacher teacher_6 = new Teacher(31, "Dinh");

        ArrayList<Teacher> arrayList_1 = new ArrayList<>();
        arrayList_1.add(teacher_1);
        arrayList_1.add(teacher_2);
        arrayList_1.add(teacher_3);

        ArrayList<Teacher> arrayList_2 = new ArrayList<>();
        arrayList_2.add(teacher_4);
        arrayList_2.add(teacher_5);
        arrayList_2.add(teacher_6);

        Iterator<Teacher> iterator = arrayList_1.iterator();

        /*while (iterator.hasNext()) {
            // Khong co phuong thuc add() de them va phuong thuc set() de chinh sua
            //iterator.add();

            Teacher teacher = iterator.next();
            if (teacher.getId() == 1) {
                teacher.setName("Giac Ngo");
            }

            System.out.println(teacher);
        }*/

        ListIterator<Teacher> listIterator = arrayList_2.listIterator();
        while (listIterator.hasNext()) {
            Teacher teacher = listIterator.next();
            if (teacher.getId() == 11) {
                teacher.setName("Giac Ngo");

                listIterator.add(new Teacher(55, "Giai Thoat"));
            }

            System.out.println(teacher);
        }

        listIterator.set(new Teacher(66, "Hanh Phuc"));
        listIterator.set(new Teacher(68, "Vien Man"));

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.nextIndex() + ": \t" + listIterator.previous());
        }

        System.out.println("Size: " + arrayList_2.size());
    }
}
