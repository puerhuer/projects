package com.creater.singleton.lazy;

/**
 * @Classname : Singleton3
 * @Description : 静态内部类方式
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class Singleton3 {
    /**
     * 第一次加载Singleton3类的时候不回去初始化INSTANCE
     * 只有第一次调用getInstance的时候，虚拟机才会加载SingletonHolder
     * 并初始化INSTANCE，这样不仅能确保线程安全也能保证Singleton3类的唯一性
     *
     *
     * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任
     * 何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
     */
    //私有构造方法
    private Singleton3() {}
    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
    //对外提供静态方法获取该对象
    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
