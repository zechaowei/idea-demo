package com.xsyu.Primary.PracticeDemo;

import java.util.Scanner;

/**
 * ClassName: p_test03
 * Package: com.xsyu.Primary
 * Description:斐波那契数列:1, 1, 2, 3, 5, 8, 13, 21, 34 ,55, 89……
 *      要求：设计一个Java程序，可以获取斐波那契数列上任意一位的数字，比如获取第5个数，那么就是5
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/8 - 12:57
 * @Version: v1.0
 */
public class p_test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字:");
        int target = sc.nextInt(), result;

        int a = 1, b = 1, temp;
        for (int i = 1; i < target; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        result = a;
        System.out.println("第" + target + "位上斐波那契数列的数为:" + result);
    }
}
