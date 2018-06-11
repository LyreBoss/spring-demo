package com.lyre.demo.proxydemo;

/**
 * 如果加入容器的目标对象有实现接口,用JDK代理.如果目标对象没有实现接口,用Cglib代理.
 * Created by LV on 2018/6/11.
 */
public class TestProxy {


    public static void main(String[] args) {
        UserDao dao = new UserDao();

        UserDao proxy = (UserDao) new ProxyFactory(dao).getProxyInstance();

        proxy.save();
    }
}
