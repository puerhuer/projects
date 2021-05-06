package com.princilples.demo2.after;

/**
 * @Classname : Square
 * @Description : 正方形
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class Square implements Quadrilateral{

    private Double side;

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double getLength() {
        return side;
    }

    @Override
    public Double getWidth() {
        return side;
    }
}
