package com.xsyu.Primary.throwDemo.Demo01;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.throwDemo.Demo01
 * Description: 抛出异常
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/20 - 22:19
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        //int[] arr = new int[Integer.MAX_VALUE];
        test02(1, 10);
        test(1, 0);
    }

    //写法一
    private static int test(int a, int b){
        System.out.println("test方法调用");
        ArithmeticException exception = new ArithmeticException("test()方法 除数不能为0");
        if (b == 0)
            throw exception;
        return a / b;
    }

    //写法二
    private static int test02(int a, int b){
        System.out.println("test02方法调用");
        if (b == 0)
            throw new ArithmeticException("test02()方法 除数不能为0");
        return a / b;
    }
}
