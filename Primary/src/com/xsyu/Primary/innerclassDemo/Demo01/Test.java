package com.xsyu.Primary.innerclassDemo.Demo01;

/**
 * ClassName: test
 * Package: com.xsyu.Primary.innerclassDemo.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/18 - 20:55
 * @Version: v1.0
 */
public class Test {

    private final String name;

    public Test(String name) {
        this.name = name;
    }

    public class Inner {
        public void test() {
            System.out.println("我是成员内部类: " + name);
        }

//        String name;
//        public void test01(String name) {
//            System.out.println("方法参数的name = " + name);
//            System.out.println("成员内部类的name = " + this.name);
//            System.out.println("成员内部类的name = " + Test.this.name);
//        }
    }
}
