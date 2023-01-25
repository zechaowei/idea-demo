package com.xsyu.Primary.innerclassDemo.Demo02;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.innerclassDemo.Demo02
 * Description: 静态内部类 和 局部内部类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/18 - 21:37
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Test test = new Test("小红");
        Test.Inner inner = new Test.Inner();            //可以直接 new 一个新的对象
        inner.test();
    }
}
