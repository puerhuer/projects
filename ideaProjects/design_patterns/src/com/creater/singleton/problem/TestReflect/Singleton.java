package com.creater.singleton.problem.TestReflect;

/**
 * @Classname : Singleton
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class Singleton {

    //私有构造方法
    private Singleton() {
        /*
            反射破解单例模式需要添加的代码
            这种方式比较好理解的很哪，当通过反射调用的时候，直接抛运行时异常
        */
        if(instance != null) {
            throw new RuntimeException();
        }
    }
    private static volatile Singleton instance;
    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        if(instance != null) {
            return instance;
        }
        synchronized (Singleton.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton();
            return instance;
        }
    }
}
