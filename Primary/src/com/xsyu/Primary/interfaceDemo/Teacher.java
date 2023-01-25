package com.xsyu.Primary.interfaceDemo;

/**
 * ClassName: Teacher
 * Package: com.xsyu.Primary.interfaceDemo
 * Description:
 *         1、实现接口时，同样需要将接口中所有的抽象方法全部实现
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 20:29
 * @Version: v1.0
 */
public class Teacher extends Person implements Study{

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void study() {
        System.out.println("我是老师: " + super.name + "，我学得更厉害一点");
    }
}
