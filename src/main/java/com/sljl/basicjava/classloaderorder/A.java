package com.sljl.basicjava.classloaderorder;

/**
 * @author L.Y.F
 * @create 2019-03-08 16:15
 */
public class A {

    static {
        System.out.println("print A Static");
    }

    {
        System.out.println("print A ");
    }

    public A() {
        System.out.println("print A Structure");
    }

    public void testA() {
        System.out.println("print A Method");
    }

}
