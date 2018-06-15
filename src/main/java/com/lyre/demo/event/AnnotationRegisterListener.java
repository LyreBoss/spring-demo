package com.lyre.demo.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by LV on 2018/6/14.
 */

@Component
public class AnnotationRegisterListener {


    /**
     * 注册监听实现方法
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void register(UserRegisterEvent userRegisterEvent)
    {
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();


        //输出注册用户信息
      //  System.out.println("@EventListener注册信息，用户名："+user.()+"，密码："+user.getPassword());
    }

}
