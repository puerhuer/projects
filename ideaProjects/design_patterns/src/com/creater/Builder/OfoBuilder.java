package com.creater.Builder;

/**
 * @Classname : MobikeBuilder
 * @Description : ofo单车类
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class OfoBuilder extends Builder{

    @Override
    public void buildSeat() {
        mbike.setSeat("真丝座椅");
    }

    @Override
    public void buildFrame() {
        mbike.setFrame("铝合金框架");
    }

    @Override
    public Bike creatBike() {
        return mbike;
    }
}
