package com.princilples.demo2.before;

import java.sql.SQLClientInfoException;

/**
 * @Classname : RectangleDemo
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10.00);
        rectangle.setLength(20.00);
        resize(rectangle);
        System.out.println(rectangle.getLength() + "----" + rectangle.getWidth());
        System.out.println("=============================================================");
        Square square = new Square();
        square.setLength(10.00);
        System.out.println(square.getLength());
    }

    /**
     * 拓宽方法
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        while (rectangle.getLength() >= rectangle.getWidth()) {
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

}
