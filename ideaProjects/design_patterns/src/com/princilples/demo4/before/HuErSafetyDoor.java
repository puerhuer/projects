package com.princilples.demo4.before;

/**
 * @Classname : HuErSafetyDoor
 * @Description : 胡二安全门实现类
 * @Created by kingdee
 * @Date : 2021/5/7
 */
public class HuErSafetyDoor implements SafetyDoor{

    public void antiTheft() {
        System.out.println("防盗");
    }
    public void fireproof() {
        System.out.println("防火");
    }
    public void waterproof() {
        System.out.println("防水");
    }
}
