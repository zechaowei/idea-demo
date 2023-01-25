package com.xsyu.Primary.throwDemo.Demo02;

/**
 * ClassName: Main02
 * Package: com.xsyu.Primary.throwDemo.Demo02
 * Description:
 *              1、如果某个方法明确指出会抛出哪些异常，除非抛出的异常是一个运行时异常，否则我们必须要使用try-catch语句块进行异常捕获，不然就无法通过编译；
 *              2、如果某个方法明确指出会抛出哪些异常，我们必须要使用try-catch语句块进行异常捕获，不然就无法通过编译；
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/20 - 22:55
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        try {
            System.out.println("调用test方法前!");
            test(1, 0);     //没有打印下面的输出语句：说明这里异常报错，后面的语句不会执行
            System.out.println("调用test方法后!");
        } catch (ArithmeticException e) {
            //栈追踪异常
            e.printStackTrace();
            System.out.println("异常错误信息: " + e.getMessage());
        }
    }

    public static int test(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("除数不能为0");
        return a / b;
    }
}
