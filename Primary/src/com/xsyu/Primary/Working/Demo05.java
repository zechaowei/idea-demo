package com.xsyu.Primary.Working;

/**
 * ClassName: Demo05
 * Package: com.xsyu.Primary.Working
 * Description: 汉诺塔问题
 *              按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘
 *              参考视频:https://www.bilibili.com/video/BV1YP4y1o75f?p=72&vd_source=26358c0abc7c39ff8f3329b40c3818d5
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/24 - 10:39
 * @Version: v1.0
 */
public class Demo05 {
    public static void main(String[] args) {
        hanoi('A', 'B', 'C', 3);
    }

    //将N片圆盘从A移到C
    public static void hanoi(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println(a + " ---> " + c);
        } else {
            hanoi(a, c, b, n - 1);
            System.out.println(a + " ---> " + c);
            hanoi(b, a, c, n - 1);
        }
    }
}
