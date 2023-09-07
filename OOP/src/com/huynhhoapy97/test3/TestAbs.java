package com.huynhhoapy97.test3;

/*
* abstract class khi implement mot interface thi khong can trien khai phuong thuc cua interface
* vi ca hai cung la abstract
* */
public abstract class TestAbs implements ITest {
    public void testMethodCalledFromInterface(){
        ITest.checking();
    }
}
