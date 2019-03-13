package com.sljl.basicjava.designpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 当被代理的目标对象没有实现接口时，使用Cglib的方式实现动态代理
 *
 * @author L.Y.F
 * @create 2019-03-11 11:31
 */
public class ChildrenCglibDynamicProxy implements MethodInterceptor {

    private Object targetObj;

    public ChildrenCglibDynamicProxy(Object targetObj) {
        this.targetObj = targetObj;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(this.targetObj.getClass());
        en.setCallback(this);
        return en.create();
    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("小宝宝先洗手");
        Object returnValue = method.invoke(targetObj, args);
        System.out.println("小宝宝要刷牙");
        return returnValue;
    }
    
    public static void main(String[] args) {
        ChildrenImpl children = new ChildrenImpl();
        ChildrenImpl proxy = (ChildrenImpl) new ChildrenCglibDynamicProxy(children).getProxyInstance();
        proxy.eat();
    }

}
