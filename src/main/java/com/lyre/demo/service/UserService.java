package com.lyre.demo.service;

import com.lyre.demo.event.UserBean;
import com.lyre.demo.event.UserRegisterEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LV on 2018/6/14.
 */
@Service
public class UserService {

    @Resource
    private ApplicationContext context ;

    /**
     * 用户注册方法
     * @param user
     */
    public void register(UserBean user)
    {
        //发布UserRegisterEvent事件
        context.publishEvent(new UserRegisterEvent(this,user));
    }
}
