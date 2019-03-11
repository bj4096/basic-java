package com.sljl.basicjava.designpattern.singleton;

/**
 * 使用静态方式创建单例
 *
 * @author L.Y.F
 * @create 2019-03-08 16:58
 */
public class SingletonD {

    private SingletonD(){

    }

    private static class SingletonDHolder{
        // 针对SingletonC的升级版，定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。
        // 而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。
        // 优点：达到了lazy loading的效果，即按需创建实例。
        private final static SingletonD singletonD = new SingletonD();
    }

    public static SingletonD getInstance(){
        return SingletonDHolder.singletonD;
    }

}
