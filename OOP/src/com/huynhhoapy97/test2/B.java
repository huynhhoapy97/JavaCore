package com.huynhhoapy97.test2;

import com.huynhhoapy97.test1.A;
import com.huynhhoapy97.test1.C;

public class B extends A {
    public void demo() {
        System.out.println(super.name);
        this.call();

        // Compile Error
        /*A a = new A();
        System.out.println(a.name);*/

        // Compile error
        /*C c = new C();
        System.out.println(c.age);*/

        System.out.println(sum(1, 2));
    }

    /*
        Apply parameter list - this one is a special case of Overloading
     */
    public int sum(int ...a) {
        int sum = 0;
        for (int item : a) {
            sum += item;
        }

        return sum;
    }

    // Apply Overloading
    final void checkSomething(){

    }

    void checkSomething(String tracking){

    }
}
