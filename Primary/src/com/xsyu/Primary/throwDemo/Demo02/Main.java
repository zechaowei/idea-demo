package com.xsyu.Primary.throwDemo.Demo02;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.throwDemo.Demo02
 * Description: 异常处理
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/20 - 22:45
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        //单独运行以下代码，jvm报错，NullPointerException，空指针异常
//        Object object = null;
//        object.toString();

        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e) {  //异常本身也是一个对象，catch中实际上就是用一个局部变量去接收异常
            System.out.println("空指针异常");
            //打印栈追踪信息
            e.printStackTrace();
            //获取异常的错误信息
            System.out.println("异常错误信息: " + e.getMessage());
        }

        System.out.println("程序继续正常运行！");
    }
}
