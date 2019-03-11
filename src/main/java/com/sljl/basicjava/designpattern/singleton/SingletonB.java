package com.sljl.basicjava.designpattern.singleton;

/**
 * 多线程加锁实现单例
 *
 * @author L.Y.F
 * @create 2019-03-08 16:41
 */
public class SingletonB {

    private static SingletonB singletonB = null;

    private SingletonB() {

    }

    public static synchronized SingletonB getInstance1() {
        // 线程同步锁，保证一个线程判断创建对象时，其他线程无法同时进行操作
        // 缺点就是加方法锁效率很低，会导致线程每次调用该方法时都要获得锁才可以
        if (singletonB == null) {
            singletonB = new SingletonB();
        }
        return singletonB;
    }

    public static SingletonB getInstance2() {
        if (null == singletonB) {
            // 上面方法的升级版，只有当第一次对象为null时才会加锁实例化对象，对象创建以后就不在使用锁
            synchronized(SingletonB.class) {
                if (singletonB == null) {
                    singletonB = new SingletonB();
                }
            }
        }
        return singletonB;
    }

}
