package com.xsyu.Primary.Person;

/**
 * ClassName: Main02
 * Package: com.xsyu.Primary.Person
 * Description:类的封装  ----> 构造函数另类封装 person.getInstance();
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/11 - 17:26
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        Person02 person02 = Person02.getInstance();
        person02.setName("大芳");
        System.out.println(person02.getName());
    }
}
