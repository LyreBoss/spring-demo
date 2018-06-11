package com.lyre.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LV on 2018/6/11.
 */


@RestController
@RequestMapping(value = "demo")
public class ControllerHello {


    @RequestMapping(value = "hello")
    public String hello (){
        return "hello world ";
    }

}
