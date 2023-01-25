package com.xsyu.Primary.PracticeDemo;

/**
 * ClassName: p_test01
 * Package: com.xsyu.Primary
 * Description: 打印水仙花数
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/8 - 12:55
 * @Version: v1.0
 */
public class p_test01 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            //个位
            int a = i % 10;
            //十分位
            int b = i / 10 % 10;
            //百分位
            int c = i / 100;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i){
                System.out.println(i + "  是水仙花数!");
            }
        }
    }
}
