package org.code.blocks.common.cglib.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.code.blocks.common.cglib.MonitorUtil;

/**
 * Jdk动态代理
 * JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理，cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 * @author darwindu
 * @date 2019/5/6
 **/
public class JdkProxy<T> implements InvocationHandler{

    // 被代理人
    private T person;

    public T getInstance(T person) {

        this.person = person;

        //通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
        //第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
        //第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所执行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
        //第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
        return (T)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("todo::start");
        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();

        Object result = method.invoke(person, args);
        System.out.println("todo::end");
        MonitorUtil.finish(method.getName());

        return result;
    }
}
