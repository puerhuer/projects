package com.princilples.demo3.before;

/**
 * @Classname : XiJieHardDisk
 * @Description : 希捷硬盘类
 * @Created by kingdee
 * @Date : 2021/5/7
 */
public class XiJieHardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
