package com.xsyu.Primary.abstractDemo;

/**
 * ClassName: Student
 * Package: com.xsyu.Primary.abstractDemo
 * Description:学生 实体类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 19:26
 * @Version: v1.0
 */
public class Student extends Person{

    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study() {
        System.out.println("我是学生，我叫：" + name + "，我在学习！");
    }

    protected void exam(){
        System.out.println("我是学生，我就是小镇做题家，拿个 A 轻轻松松");
    }
}

/**
 * 报错信息
 * 1、Class 'Student' must either be declared abstract or implement abstract method 'exam()' in 'Person'
 *    类'Student'必须被声明为抽象的，或者在'Person'中实现抽象方法'exam()'
 */
