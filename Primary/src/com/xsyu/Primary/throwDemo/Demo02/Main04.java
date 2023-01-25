package com.xsyu.Primary.throwDemo.Demo02;

/**
 * ClassName: Main04
 * Package: com.xsyu.Primary.throwDemo.Demo02
 * Description:
 *          1、当代码可能出现多种类型的异常时，我们希望能够分不同情况处理不同类型的异常，就可以使用多重异常捕获，但是要注意顺序  //父类型在前，会将子类的也捕获
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/21 - 1:37
 * @Version: v1.0
 */
public class Main04 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[-1] = 10;
        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            //RuntimeException 是 ArrayIndexOutOfBoundsException的父类，因此ArrayIndexOutOfBoundsException执行必须在RuntimeException之前执行
        } catch (RuntimeException e){
            System.out.println("我是运行时异常");
        }
    }
}
