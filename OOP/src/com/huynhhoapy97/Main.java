package com.huynhhoapy97;

import com.huynhhoapy97.test2.B;
import com.huynhhoapy97.test3.Test;
import com.huynhhoapy97.test3.TestAbs;
import com.huynhhoapy97.test4.Circle;
import com.huynhhoapy97.test4.Shape;
import com.huynhhoapy97.test4.Square;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.demo();

        // Khong the lay duoc thong tin static boi thuoc tinh static dang co modifier la private
        /*System.out.println(C.information);*/

        // Khong the tao instance truc tiep tu abstract class
        /*Shape shape = new Shape();*/

        // Ap dung tinh da hinh de tao instance tu abstract class
        Shape shape = new Square();
        shape.draw();

        shape = new Circle();
        shape.draw();

        TestAbs testAbs = new Test();
        testAbs.testMethodCalledFromInterface();
        testAbs.checkInfo();
    }
}
