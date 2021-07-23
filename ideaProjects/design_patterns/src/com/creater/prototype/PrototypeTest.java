package com.creater.prototype;

/**
 * @Classname : PrototypeTest
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();
        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}
