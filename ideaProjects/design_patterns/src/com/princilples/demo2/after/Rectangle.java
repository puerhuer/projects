package com.princilples.demo2.after;

/**
 * @Classname : Rectangle
 * @Description : 长方形
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class Rectangle implements Quadrilateral{

    private Double length;
    private Double width;

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double getLength() {
        return length;
    }

    @Override
    public Double getWidth() {
        return width;
    }
}
