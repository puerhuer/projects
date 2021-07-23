package com.creater.singleton.hungry;

/**
 * @Classname : Test
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class Test {

    public Test() {
        System.out.println("父类构造方法");
    }

    static {
        System.out.println("父类静态代码块");
    }

    public static void test() {
        System.out.println("父类静态方法");
    }
}
