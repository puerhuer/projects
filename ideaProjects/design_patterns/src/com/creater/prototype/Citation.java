package com.creater.prototype;

/**
 * @Classname : Citation
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class Citation implements Cloneable{
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return (this.name);
    }
    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
