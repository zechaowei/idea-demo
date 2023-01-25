package com.xsyu.Primary.interfaceDemo;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: Person
 * Package: com.xsyu.Primary.interfaceDemo
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 20:24
 * @Version: v1.0
 */
@Setter
@Getter
public abstract class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public abstract void study();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
