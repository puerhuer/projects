package com.princilples.demo3.after;

/**
 * @Classname : Computer
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/7
 */
public class Computer {

    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;
    public Cpu getCpu() {
        return cpu;
    }
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public Memory getMemory() {
        return memory;
    }
    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    public HardDisk getHardDisk() {
        return hardDisk;
    }
    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void run() {
        System.out.println("计算机工作");
        cpu.run();
        memory.save();
        String data = hardDisk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
