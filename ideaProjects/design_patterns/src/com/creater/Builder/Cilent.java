package com.creater.Builder;

/**
 * @Classname : Cilent
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class Cilent {

    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new OfoBuilder());
    }

    private static void showBike(Builder mBuilder) {
        Director director = new Director(mBuilder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
