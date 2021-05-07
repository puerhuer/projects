package com.princilples.demo2.after;

/**
 * @Classname : RectangleDemo2
 * @Description : 测试
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class RectangleDemo2 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10.00);
        rectangle.setLength(20.00);
        resize(rectangle);
        System.out.println(rectangle.getLength() + "----" + rectangle.getWidth());

        Square square = new Square();
        square.setSide(10.00);
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
