package com.sljl.basicjava.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 当被代理的目标对象有实现接口时，使用JDK的原生的方式实现动态代理
 *
 * @author L.Y.F
 * @create 2019-03-08 18:34
 */
public class ChildrenJDKDynamicProxy {

    public static void main(String[] args) {
        final IChildren chil = new ChildrenImpl();
        IChildren children = (IChildren) Proxy.newProxyInstance(chil.getClass().getClassLoader(), chil.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("小宝宝先洗手");
                //执行目标对象方法
                System.out.println(proxy.getClass().getName()+"-"+method.getName());
                Object returnValue = method.invoke(chil, args);
                System.out.println("小宝宝要刷牙");
                return returnValue;
            }
        });
        children.eat();
    }
}
