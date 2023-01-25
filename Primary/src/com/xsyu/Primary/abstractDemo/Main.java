package com.xsyu.Primary.abstractDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.abstractDemo
 * Description:抽象类
 *          1、具体的实现，需要由子类来完成，而且如果是子类，必须要实现抽象类中所有抽象方法
 *          2、抽象类由于不是具体的类定义（它是类的抽象）可能会存在某些方法没有实现，因此无法直接通过new关键字来直接创建对象：
 *             eg:Person person = new Student("小明", 18, "男");
 *             要使用抽象类，我们只能去创建它的子类对象
 *          3、要使用抽象类，我们只能去创建它的子类对象
 *          4、抽象类一般只用作继承使用，当然，抽象类的子类也可以是一个抽象类
 *          5、抽象方法的访问权限不能为 private
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 19:30
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        //Person person = new Person();
        Person person = new Student("小明", 18, "男");
        person.exam();
        Student student = new Student("小明", 18, "男");
        student.study();

        Person person1 = new Worker("小蓝", 20, "男");
        person1.exam();
        Worker worker = new Worker("小蓝", 20, "男");
        worker.study();
    }
}

/**
 * 1、'Person' is abstract; cannot be instantiated
 *      Person person = new Person();
 *      “Person”是抽象的;不能被实例化
 */