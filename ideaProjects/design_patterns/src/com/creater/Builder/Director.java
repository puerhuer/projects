package com.creater.Builder;

/**
 * @Classname : Director
 * @Description : 指挥者类
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class Director {

    private Builder mbuilder;

    public Director(Builder mbuilder) {
        this.mbuilder = mbuilder;
    }

    public Bike construct() {
        mbuilder.buildFrame();
        mbuilder.buildSeat();
        return mbuilder.creatBike();
    }
}
