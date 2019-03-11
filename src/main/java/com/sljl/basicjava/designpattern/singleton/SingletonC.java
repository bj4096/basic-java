package com.sljl.basicjava.designpattern.singleton;

/**
 * 使用静态方式创建单例
 *
 * @author L.Y.F
 * @create 2019-03-08 16:52
 */
public class SingletonC {

    private static SingletonC singletonC = new SingletonC();

    private SingletonC() {

    }

    public static SingletonC getInstance() {
        // 使用静态类的方式直接初始化类对象
        // 缺点就是在不需要的时候也会初始化该对象，没有lazy loading的效果，从而降低内存的使用率。
        return singletonC;
    }

}
