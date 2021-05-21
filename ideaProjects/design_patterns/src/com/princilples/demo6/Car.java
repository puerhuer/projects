package com.princilples.demo6;

/**
 * @Classname : Car
 * @Description : 测试合成复用原则
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class Car {

    protected Color color;

    public void move() {
        System.out.println(color.getCarColor()+"颜色的小车移动啦");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.color = new White();
        car.move();
    }
}
