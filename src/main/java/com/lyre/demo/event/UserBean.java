package com.lyre.demo.event;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *  用户 bean
 * Created by LV on 2018/6/14.
 */
@Data
public class UserBean {


    @Getter @Setter private String name ;

    @Getter @Setter private int age;
}
