package com.huynhhoapy97.test3;

public interface ITest {
    // Thuoc tinh trong interface mac dinh la public static final
    // Phuong thuc trong interface mac dinh la public abstract
    int info = 5;
    void checkInfo();

    // interface tu Java 8 co ho tro static method
    static void checking(){
        System.out.println("support static method");
    };

    // interface tu Java 9 moi ho tro private method
    /*private void checkingPrivate(){
        System.out.println(1);
    };*/
}
