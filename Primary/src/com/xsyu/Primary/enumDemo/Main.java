package com.xsyu.Primary.enumDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.enumDemo
 * Description: 枚举
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/16 - 14:22
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus());
        System.out.println(student.getStatus().getName());

        Status study = Status.valueOf("STUDY");
        System.out.println(study);
        System.out.println(study.getName());

        //No enum constant com.xsyu.Primary.enumDemo.Status.xxx 无枚举常量xxx
//        Status xxx = Status.valueOf("xxx");
//        System.out.println(xxx);
    }
}
