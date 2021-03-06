package com.creater.singleton.problem.TestSerial;

import java.io.Serializable;

/**
 * @Classname : Singleton
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class Singleton implements Serializable {

    //私有构造方法
    private Singleton() {}
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
