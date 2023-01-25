package com.xsyu.Primary.Person;

/**
 * ClassName: Person
 * Package: com.xsyu.Primary
 * Description:Person实体类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/11 - 17:17
 * @Version: v1.0
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //名字中含"小"字，不可以设置名字
    public void setName(String name){
        if (name.contains("小")){
            System.out.println("修改名字失败！");
            return;
        }
        System.out.println("修改名字成功！");
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
