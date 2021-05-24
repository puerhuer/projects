package com.creater.prototypeDeepClone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Classname : CitationTest
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/24
 */
public class CitationTest {
    /**
     * stu对象和stu1对象是同一个对象，就会产生将stu1对象中name属性值改为“李四”，两个
     * Citation（奖状）对象中显示的都是李四。这就是浅克隆的效果，对具体原型类（Citation）中的
     * 引用类型的属性进行引用的复制。这种情况需要使用深克隆，而进行深克隆需要使用对象流。
     */
    public static void main(String[] args) throws Exception {
        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("C:\\Users\\kingdee\\Desktop\\a.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);

        oos.close();
        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("C:\\Users\\kingdee\\Desktop\\a.txt"));
        //读取对象
        Citation c2 = (Citation) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");
        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
        c1.show();
        c2.show();
    }
}
