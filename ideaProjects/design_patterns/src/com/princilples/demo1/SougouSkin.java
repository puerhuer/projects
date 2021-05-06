package com.princilples.demo1;

/**
 * @Classname : SougouSkin
 * @Description : 搜狗皮肤类
 * @Created by kingdee
 * @Date : 2021/5/6
 */
public class SougouSkin {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
