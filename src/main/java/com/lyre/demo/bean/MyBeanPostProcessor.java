package com.lyre.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by LV on 2018/6/11.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor(){
        System.out.println("【BeanPostProcessor接口】调用BeanPostProcessor的构造方法");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor接口】调用postProcessBeforeInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor接口】调用postProcessAfterInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
    }
}
