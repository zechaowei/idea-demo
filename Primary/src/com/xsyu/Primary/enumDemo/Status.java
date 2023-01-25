package com.xsyu.Primary.enumDemo;

/**
 * ClassName: Status
 * Package: com.xsyu.Primary.enumDemo
 * Description: 枚举类
 *              1、枚举类型是普通的类，那么我们也可以给枚举类型添加独有的成员方法
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/16 - 13:54
 * @Version: v1.0
 */

public enum Status {
    RUNNING("跑步"), STUDY("学习"), SLEEP("睡觉");

    //枚举的成员变量
    private final String name;

    //覆盖原有的构造方法（默认 private，只能内部使用！）
    private Status(String name) {
        this.name = name;
    }

    //获取封装的成员变量
    public String getName(){
        return name;
    }

}
