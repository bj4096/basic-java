package com.sljl.basicjava.designpattern.singleton;

/**
 * 单线程单例模式
 *
 * @author L.Y.F
 * @create 2019-03-08 16:36
 */
public class SingletonA {

    public static SingletonA singletonA = null;

    private SingletonA() {
        // 私有构造防实例化
    }

    public static SingletonA getInstance() {
        // 当多线程并发的时候可能多个线程同时拿到null，导致多个线程分别创建对象
        if (null == singletonA) {
            singletonA = new SingletonA();
        }
        return singletonA;
    }

}
