package com.creater.Builder;

/**
 * @Classname : MobikeBuilder
 * @Description : 摩托单车类
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class MobikeBuilder extends Builder{

    @Override
    public void buildSeat() {
        mbike.setSeat("真皮座椅");
    }

    @Override
    public void buildFrame() {
        mbike.setFrame("铝制框架");
    }

    @Override
    public Bike creatBike() {
        return mbike;
    }
}
