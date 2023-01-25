package com.xsyu.Primary.interfaceDemo;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: Student
 * Package: com.xsyu.Primary.interfaceDemo
 * Description:
 *      1、实现接口时，同样需要将接口中所有的抽象方法全部实现
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 20:24
 * @Version: v1.0
 */
@Getter
@Setter
public class Student extends Person implements Study, Cloneable{

    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study() {
        System.out.println("我是学生: " + super.name + "，我学习得比较佛系");
    }

    //提升clone访问权限
    @Override
    public Object clone() throws CloneNotSupportedException {
        //因为底层是C++实现，我们直接调用父类的实现就可以了
        return super.clone();
    }
}
