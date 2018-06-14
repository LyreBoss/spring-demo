package com.lyre.demo.service;

/**
 * 双重锁校验
 * Created by LV on 2018/6/14.
 */
public class DubbleSingleton {

    //private static DubbleSingleton instance ;

    private static volatile DubbleSingleton instance ;


    public static DubbleSingleton getInstance (){
        if(instance == null){
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            synchronized ( DubbleSingleton.class){
                if(instance == null){
                    instance = new DubbleSingleton() ;
                }
            }

        }
        return instance;
    }


    public static void main(String[] args) {
      DubbleSingleton str =   DubbleSingleton.getInstance() ;



        System.out.println(">>>>>>>>>>>>>>");
    }

}
