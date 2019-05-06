package org.code.blocks.common.cglib.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.code.blocks.common.cglib.MonitorUtil;

/**
 * cglib 动态代理
 * JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理，cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 * @author darwindu
 * @date 2019/5/6
 **/
public class CglibProxy implements MethodInterceptor{

    private Object targetObject;

    /**
     * 这里的目标类型为Object，则可以接受任意一种参数作为被代理类，实现了动态代理
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        //注意该处代理的创建过程
        Object proxyObj = enhancer.create();
        // 返回代理对象
        return proxyObj;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("todo::start");
        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();

        Object obj = method.invoke(targetObject, args);
        System.out.println("todo::end");

        MonitorUtil.finish(method.getName());
        return obj;
    }
}
