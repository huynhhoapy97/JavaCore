package com.huynhhoapy97;

import com.huynhhoapy97.interfaces.Skill;
import com.huynhhoapy97.interfaces.SkillImpl;
import com.huynhhoapy97.models.Character;

import java.lang.reflect.Modifier;

public class Main {
    private static boolean isPublic;
    private static boolean isInterface;
    private static boolean isAbstract;
    private static boolean isFinal;

    public static void main(String[] args) {
        // Way 1: get Class object from string name of class
        try {
            Class classTest_1 = Class.forName("com.huynhhoapy97.models.Sectarian");
            System.out.println("Name within package of classTest_1: " + classTest_1.getName());
            System.out.println("Name without package of classTest_1: " + classTest_1.getSimpleName());
            System.out.println("Package of classTest_1: " + classTest_1.getPackage());

            int modifierTest_1 = classTest_1.getModifiers();
            isPublic = Modifier.isPublic(modifierTest_1);
            isInterface = Modifier.isInterface(modifierTest_1);
            isAbstract = Modifier.isAbstract(modifierTest_1);
            isFinal = Modifier.isFinal(modifierTest_1);
            System.out.println("isPublic: " + isPublic);
            System.out.println("isInterface: " + isInterface);
            System.out.println("isAbstract: " + isAbstract);
            System.out.println("isFinal: " + isFinal);

            Class superClassTest_1 = classTest_1.getSuperclass();
            System.out.println("Super Name within package of classTest_1: " + superClassTest_1.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("----------------------------------------------");
        // Way 2: get Class object from the name of class
        Class classTest_2 = Character.class;
        System.out.println("Name within package of classTest_2: " + classTest_2.getName());
        System.out.println("Name without package of classTest_2: " + classTest_2.getSimpleName());
        System.out.println("Package of classTest_2: " + classTest_2.getPackage());

        int modifierTest_2 = classTest_2.getModifiers();
        isPublic = Modifier.isPublic(modifierTest_2);
        isInterface = Modifier.isInterface(modifierTest_2);
        isAbstract = Modifier.isAbstract(modifierTest_2);
        isFinal = Modifier.isFinal(modifierTest_2);
        System.out.println("isPublic: " + isPublic);
        System.out.println("isInterface: " + isInterface);
        System.out.println("isAbstract: " + isAbstract);
        System.out.println("isFinal: " + isFinal);

        Class superClassTest_2 = classTest_2.getSuperclass();
        System.out.println("Super Name within package of classTest_2: " + superClassTest_2.getName());

        System.out.println("----------------------------------------------");
        // Way 3: get Class object from the object
        Skill skill = new SkillImpl();
        Class classTest_3 = skill.getClass();
        System.out.println("Name within package of classTest_3: " + classTest_3.getName());
        System.out.println("Name without package of classTest_3: " + classTest_3.getSimpleName());
        System.out.println("Package of classTest_3: " + classTest_3.getPackage());

        int modifierTest_3 = classTest_3.getModifiers();
        isPublic = Modifier.isPublic(modifierTest_3);
        isInterface = Modifier.isInterface(modifierTest_3);
        isAbstract = Modifier.isAbstract(modifierTest_3);
        isFinal = Modifier.isFinal(modifierTest_3);
        System.out.println("isPublic: " + isPublic);
        System.out.println("isInterface: " + isInterface);
        System.out.println("isAbstract: " + isAbstract);
        System.out.println("isFinal: " + isFinal);

        Class superClassTest_3 = classTest_3.getSuperclass();
        System.out.println("Super Name within package of classTest_3: " + superClassTest_3.getName());
    }
}
