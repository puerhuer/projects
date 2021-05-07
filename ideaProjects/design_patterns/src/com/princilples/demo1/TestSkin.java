package com.princilples.demo1;

/**
 * @Classname : TestSkin
 * @Description : 测试类:测试开闭原则
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class TestSkin {

    public static void main(String[] args) {
        SougouSkin sougouSkin = new SougouSkin();
        sougouSkin.setSkin(new HuerSkin());
        sougouSkin.display();
    }
}
