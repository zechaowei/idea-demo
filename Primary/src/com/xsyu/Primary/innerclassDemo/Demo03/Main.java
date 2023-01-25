package com.xsyu.Primary.innerclassDemo.Demo03;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.innerclassDemo.Demo03
 * Description: 匿名内部类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/19 - 20:34
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student() {
            @Override
            public void test() {
                System.out.println("我是匿名内部类 Student ! " + name);
            }
        };
        student.test();

        Study study = new Study() {
            @Override
            public void study() {
                System.out.println("我是匿名内部类 Study接口 !");
            }
        };
        study.study();

        Test test = new Test(){
            {
                name = "我是匿名内部类 Test--->test 初始化的变量";
            }
        };
        System.out.println(test.getName());

        Test test1 = new Test() {
            {
                testDemo();
            }

            void testDemo(){
                name = "我是匿名内部类 Test--->test1 初始化的变量";
                System.out.println("方法执行");
            }
        };
        System.out.println(test1.getName());
    }
}
