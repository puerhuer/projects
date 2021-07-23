package com.creater.singleton.lazy;

/**
 * @Classname : Singleton1
 * @Description : 懒汉式 线程安全 效率低
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class Singleton1 {

    //私有构造方法
    private Singleton1() {}
    //在成员位置创建该类的对象
    private static Singleton1 instance;
    //对外提供静态方法获取该对象
    public static synchronized Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
