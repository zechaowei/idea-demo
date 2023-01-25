package com.xsyu.Primary.abstractDemo;

/**
 * ClassName: Worker
 * Package: com.xsyu.Primary.abstractDemo
 * Description:工作者 实体类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 19:27
 * @Version: v1.0
 */
public class Worker extends Person {

    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study(){
        System.out.println("我是工人，我叫：" + super.name + "，我在工作！");
    }

    public void exam(){
        System.out.println("我是工人，做题我并不擅长，只能得到 D");
    }

}
