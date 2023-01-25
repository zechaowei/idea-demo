package com.xsyu.Primary.Person;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/11 - 17:19
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("小明", 18, "男");
        person.setName("小芳");
        person.setName("大芳");
        System.out.println("最终的名字为:" + person.getName());
    }
}
