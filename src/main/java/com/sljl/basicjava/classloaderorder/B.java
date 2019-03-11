package com.sljl.basicjava.classloaderorder;

/**
 * @author L.Y.F
 * @create 2019-03-08 16:15
 */
public class B extends A {

    static {
        System.out.println("print B Static");
    }

    {
        System.out.println("print B ");
    }

    public B() {
        System.out.println("print B Structure");
    }

    public void testB() {
        System.out.println("print B Method");
    }
    
    public static void main(String[] args) {
        B b = new B();
    }

}
