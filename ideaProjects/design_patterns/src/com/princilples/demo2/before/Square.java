package com.princilples.demo2.before;

/**
 * @Classname : Square
 * @Description : 正方形
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class Square extends Rectangle{

    @Override
    public void setLength(Double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(Double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
