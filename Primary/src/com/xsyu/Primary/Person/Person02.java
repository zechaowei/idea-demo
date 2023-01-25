package com.xsyu.Primary.Person;

/**
 * ClassName: Person02
 * Package: com.xsyu.Primary.Person
 * Description:Person实体类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/11 - 17:25
 * @Version: v1.0
 */
public class Person02 {
    private String name;
    private int age;
    private String sex;

    public Person02() {
    }

    public static Person02 getInstance(){
        Person02 person02  = new Person02();
        person02.name = "小明";
        return person02;
    }

    public void setName(String name){
        if (name.contains("小")){
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
