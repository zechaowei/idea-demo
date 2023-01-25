package com.xsyu.Primary.abstractDemo;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.abstractDemo
 * Description:抽象类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 19:26
 * @Version: v1.0
 */
@Getter
@Setter
public abstract class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //抽象类中可以具有抽象方法，也就是说这个方法只有定义，没有方法体
    protected abstract void exam();
}
