package com.princilples.demo4.after;

/**
 * @Classname : HuErSafetyDoor
 * @Description : 胡二安全门实现类  测试接口隔离原则
 * @Created by kingdee
 * @Date : 2021/5/7
 */
public class HuErSafetyDoor implements Fireproof,AntiTheft {

    public void antiTheft() {
        System.out.println("防盗");
    }
    public void fireproof() {
        System.out.println("防火");
    }
}
