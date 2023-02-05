package com.xsyu.Primary.Person.arrayDemo.multidimensional;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.arrayDemo.multidimensional
 * Description:     多维数组
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/17 - 17:19
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 9, 10},
                {5, 6, 7, 8}
        };
        int[] a = arr[0];
        int[] b = arr[1];
        System.out.println(a);
        System.out.println(b);

        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length);

        System.out.println("打印二维数组:");
        for (int i = 0; i < arr.length; i++) {              //arr.length    ----> 得到数组几行
            for (int j = 0; j < arr[i].length; j++) {       //arr[i].length ----> 得到第i行数组有几列
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
