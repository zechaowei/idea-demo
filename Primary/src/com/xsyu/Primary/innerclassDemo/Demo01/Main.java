package com.xsyu.Primary.innerclassDemo.Demo01;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.innerclassDemo.Demo01
 * Description: 成员内部类
 *              1、内部成员类可以访问外部成员
 *              2、使用成员内部类创建对象时，注意创建方法
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/18 - 20:54
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Test a = new Test("小明");
        Test.Inner inner1 = a.new Inner();      //依附于a创建的对象，那么就是a的
        inner1.test();

        Test b = new Test("小红");
        Test.Inner inner2 = b.new Inner();
        inner2.test();


//        Test test = new Test("Hello World!");
//        Test.Inner inner = test.new Inner();
//        inner.test01("Hello World!");
    }
}
