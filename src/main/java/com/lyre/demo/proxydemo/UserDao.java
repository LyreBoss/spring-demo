package com.lyre.demo.proxydemo;

/**
 *  目标对象,没有实现任何接口
 * Created by LV on 2018/6/11.
 */
public class UserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
