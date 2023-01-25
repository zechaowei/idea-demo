package com.xsyu.Primary.PracticeDemo;

/**
 * ClassName: p_test02
 * Package: com.xsyu.Primary
 * Description:打印九九乘法表
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/8 - 12:56
 * @Version: v1.0
 */
public class p_test02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i < j){
                    break;
                    //continue;
                }
                System.out.printf("%d × %d = %d\t", i, j, i * j);
            }
            System.out.println("\n");
        }
    }
}
