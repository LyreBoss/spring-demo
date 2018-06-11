package com.lyre.demo.proxydemo;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 * Created by LV on 2018/6/11.
 */
public class ProxyFactory implements MethodInterceptor {


    //维护目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer en = new Enhancer();

        en.setSuperclass(target.getClass());

        en.setCallback(this);

        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(" 开始事务....... ");


        Object returnValue =  method.invoke(target,objects) ;

        System.out.println(" 提交事务........");

        return returnValue;
    }
}
