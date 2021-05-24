package com.creater.Builder;

/**
 * @Classname : Builder
 * @Description : 抽象 builder 类
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public abstract class Builder {

    protected Bike mbike = new Bike();

    public abstract void buildSeat();

    public abstract void buildFrame();

    public abstract Bike creatBike();

}
