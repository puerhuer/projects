package com.creater.singleton.hungry;

/**
 * @Classname : Test1
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class Test1  extends Test{

    public Test1() {
        System.out.println("子类构造方法");
    }

    static {
        System.out.println("子类静态代码块");
    }

    public static void test1() {
        System.out.println("子类静态方法");
    }

    public static void main(String[] args) {
        new Test1().test1();
    }
}
