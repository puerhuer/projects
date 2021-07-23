package com.creater.singleton.hungry;

/**
 * @Classname : Singleton
 * @Description : 饿汉式 线程安全
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton = new Singleton();

    /**
     *   方式二
     */

    /*
        private static Singleton singleton;

        static{
            singleton = new Singleton();
        }
    */

    public static Singleton getInstance() {
        return singleton;
    }
}
