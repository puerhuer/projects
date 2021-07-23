package com.creater.prototypeDeepClone;

import com.princilples.demo4.before.SafetyDoor;

import java.io.Serializable;

/**
 * @Classname : Citation
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class Citation implements Cloneable , Serializable {
    private Student stu;
    public Student getStu() {
        return stu;
    }
    public void setStu(Student stu) {
        this.stu = stu;
    }
    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀,被评为三好学生。特发此状！");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
