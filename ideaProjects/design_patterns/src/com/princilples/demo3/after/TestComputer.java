package com.princilples.demo3.after;

/**
 * @Classname : TestComputer
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/7
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHardDisk(new XiJieHardDisk());
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());
        computer.run();
    }
}
