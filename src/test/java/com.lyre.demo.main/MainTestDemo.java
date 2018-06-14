package com.lyre.demo.main;


/**
 * main
 *
 * Created by LV on 2018/6/12.
 */
public class MainTestDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Class cache = Integer.class.getDeclaredClasses()[0]; //1
//        Field myCache = cache.getDeclaredField("cache"); //2
//        myCache.setAccessible(true);//3
//        Integer[] newCache = (Integer[]) myCache.get(cache); //4
//        newCache[132] = newCache[133]; //5
//        int a = 2 ;
//        int b = a + a ;
//        System.out.printf("%d" ,b) ;
//        System.out.println() ;
//        System.out.println("....." + b);
//        System.out.printf("%d + %d = %d", a, a, b); //
//        Integer a1 = 100 ;
//        Integer b1 = 100 ;
//        System.out.println( a1 == b1);
//
//        Integer a2 = 1000;
//        Integer b2 = 1000 ;
//        System.out.println(a2 == b2 );




    }

    public synchronized void method1(){
        System.out.println(" hello world");

    }

    public void method2(){
        System.out.println(" hello world");
    }

}
