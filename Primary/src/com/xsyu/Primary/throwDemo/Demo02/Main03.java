package com.xsyu.Primary.throwDemo.Demo02;

/**
 * ClassName: Main03
 * Package: com.xsyu.Primary.throwDemo.Demo02
 * Description: 紧跟 Main02 注释：
 *                  1、如果我们确定不想在当前这个方法中进行处理，那么我们可以继续踢皮球，抛给上一级
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/20 - 23:20
 * @Version: v1.0
 */
public class Main03 {
    public static void main(String[] args) {
//        try {
//            int[] arr = new int[1];
//            arr[1] = 100;
//        } catch (RuntimeException e) {
//            System.out.println("捕获到异常");
//        }
        try {
            int[] arr = new int[Integer.MAX_VALUE];
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("程序继续正常运行！");
    }

    private static int test(int a, int b){
        if(b == 0){
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }
}
