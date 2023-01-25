package com.xsyu.Primary.innerclassDemo.Demo02;

/**
 * ClassName: Test
 * Package: com.xsyu.Primary.innerclassDemo.Demo02
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/18 - 21:37
 * @Version: v1.0
 */
public class Test {
    private final String name;

    public Test(String name){
        this.name = name;
    }

    public static class Inner{
        public void  test() {
            System.out.println("我是静态内部类! ");
        }
    }
}
