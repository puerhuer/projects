package com.princilples.demo5;

/**
 * @Classname : TestClient
 * @Description : 测试迪米特法则
 * @Created by kingdee
 * @Date : 2021/5/7
 */
public class TestClient {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setCompany(new Company("胡二小公司"));
        agent.setFans(new Fans("粉丝1号"));
        agent.setStar(new Star("明星"));
        agent.meeting();
        agent.business();
    }
}
