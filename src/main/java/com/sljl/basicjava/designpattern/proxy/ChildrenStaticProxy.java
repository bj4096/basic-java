package com.sljl.basicjava.designpattern.proxy;

/**
 * 针对目标对象使用的静态代理
 * 目的：在不改变原ChildrenImpl类的情况下，让小宝宝在饭前饭后增加两个动作
 * 1。 吃饭之前要先洗手
 * 2。 吃完饭一定要刷牙
 *
 * @author L.Y.F
 * @create 2019-03-08 18:30
 */
public class ChildrenStaticProxy implements IChildren {

    private IChildren children;

    public ChildrenStaticProxy(IChildren children) {
        this.children = children;
    }

    public void eat() {
        System.out.println("小宝宝先洗手");
        children.eat();
        System.out.println("小宝宝要刷牙");
    }

    public static void main(String[] args) {
        IChildren children = new ChildrenImpl();
        IChildren childrenProxy = new ChildrenStaticProxy(children);
        childrenProxy.eat();
    }
}
