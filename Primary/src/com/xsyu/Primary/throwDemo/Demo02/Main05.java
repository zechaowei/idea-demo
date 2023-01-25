package com.xsyu.Primary.throwDemo.Demo02;

/**
 * ClassName: Main05
 * Package: com.xsyu.Primary.throwDemo.Demo02
 * Description:     Main04可以简单缩写
 *                  finally语句块: 无论是否出现异常，都会在最后执行
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 1:49
 * @Version: v1.0
 */
public class Main05 {
    public static void main(String[] args) {
//        try {
//            int[] arr = new int[10];
//            arr[-1] = 10;
//        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {         //将多重异常缩写，中间用 | 符号分隔开
//            System.out.println("出现了异常");
//        } finally {
//            System.out.println("我是 finally");               //无论是否出现异常，都会在最后执行
//        }

        /**
         * 测试 finally语句块
         *      无论是否出现异常，都会在最后执行
         */
        try {
            int[] arr = new int[10];
            arr[-1] = 10;
        } finally {
            System.out.println("我是 finally");
        }
    }
}
